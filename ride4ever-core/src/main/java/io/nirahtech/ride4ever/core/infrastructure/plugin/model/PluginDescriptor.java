package io.nirahtech.ride4ever.core.infrastructure.plugin.model;

import java.io.Serializable;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.Descriptor;

/**
 * Class that represents a Plugin Descriptor.
 * 
 * @author METIVIER Nicolas <nicolas.a.metivier@gmail.com>
 * @since 1.0.0
 */
public class PluginDescriptor implements Descriptor, Serializable {
    private final String groupId;
    private final String artifactId;
    private final String version;
    private final String name;
    private final String description;

    @Override
    public String getArtifactId() {
        return artifactId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getGroupId() {
        return groupId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVersion() {
        return version;
    }

    /**
     * The Plugind Descriptor default constrcutor.
     * @param groupId Group ID.
     * @param artifactId Artifact ID.
     * @param version Version.
     * @param name Name.
     * @param description Description.
     */
    public PluginDescriptor(String groupId, String artifactId, String version, String name, String description) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.name = name;
        this.description = description;
    }
}
