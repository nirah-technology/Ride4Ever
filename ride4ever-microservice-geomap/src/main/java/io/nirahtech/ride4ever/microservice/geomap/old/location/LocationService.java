/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.geomap.old.location;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.ip2location.IP2Location;
import com.ip2location.IPResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("locationService")
public final class LocationService implements LocationApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationService.class);

    private final String DATABASE_FOLDER = "ip2location";
    private final String DATABASE_CODE = "DB9LITEBIN";
    private final String DATABASAE_FILE_NAME = "IP2LOCATION-LITE-DB9.BIN";
    private final String URL = "https://www.ip2location.com/download/?token=g01TDjkhNY7TJbZVmjqU3YjmxvjQmzaigXBA1N4sOwlBqKAeBnxp9rMTHBUpyNW9&file="
            + DATABASE_CODE;
    private final String ZIP_FILE = "IP2LOCATION-LITE-DB9.BIN.ZIP";

    private File database = null;

    private final File download(String code, String destination) {
        LOGGER.info("Starting download process...");
        File result = null;
        try {
            LOGGER.info("Starting download...");
            InputStream in = new URL(URL).openStream();
            Files.copy(in, Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            LOGGER.info("Download finished.");
            result = new File(destination);
            LOGGER.info("Downloaded file: " + result.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            result = null;
        }
        LOGGER.info("End of download process.");
        return result;
    }

    private static File unzip(String zipFilePath, String destDir) {
        LOGGER.info("Starting unzip process...");
        File dir = new File(destDir);
        if (!dir.exists())
            dir.mkdirs();
        FileInputStream fis;
        File binfile = null;
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                if (fileName.endsWith("BIN")) {
                    File newFile = new File(destDir + File.separator + fileName);
                    binfile = newFile;
                    System.out.println("Unzipping to " + newFile.getAbsolutePath());
                    new File(newFile.getParent()).mkdirs();
                    FileOutputStream fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();
                }
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.info("End of unzip process.");
        return binfile;
    }

    private final void init() {
        File potentialZipFile = new File(DATABASE_FOLDER, ZIP_FILE);
        boolean mustBeDownloaded = false;
        File zipFile = null;
        if (potentialZipFile.exists()) {
            Instant lastModified = Instant.ofEpochSecond(potentialZipFile.lastModified() / 1000);
            long hours = ChronoUnit.HOURS.between(lastModified, Instant.now());
            if (hours >= 2) {
                mustBeDownloaded = true;
            } else {
                zipFile = potentialZipFile;
            }
        } else {
            mustBeDownloaded = true;
        }
        if (mustBeDownloaded) {
            File folder = new File(DATABASE_FOLDER);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            zipFile = download(DATABASE_CODE, new File(DATABASE_FOLDER, ZIP_FILE).getAbsolutePath());
        }
        File binFile = new File(DATABASE_FOLDER, DATABASAE_FILE_NAME);
        if (!binFile.exists() || mustBeDownloaded) {
            if (zipFile != null) {
                this.database = unzip(zipFile.getAbsolutePath(), DATABASE_FOLDER);
            }
        }
    }

    public LocationService() {
        this.init();
    }

    @Override
    public IPResult resolve(String ipAddress) {
        this.init();
        IP2Location ip2Location = new IP2Location();
        IPResult result = null;
        try {
            ip2Location.Open(this.database.getAbsolutePath());
            result = ip2Location.IPQuery(ipAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String resolve(final double latitude, final double longitude) {
        String result = null;
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(String.format(
                    "https://api.opencagedata.com/geocode/v1/json?q=%s+%s&key=641c51bed8ab490184632ad8526e29ad&no_annotations=1&language=en",
                    latitude, longitude))).version(HttpClient.Version.HTTP_2).GET().build();
            HttpResponse<String> response = HttpClient.newBuilder().build().send(request,
                    HttpResponse.BodyHandlers.ofString());
            result = response.body();
        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }
}
