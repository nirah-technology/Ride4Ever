package io.nirahtech.ride4ever.core.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends ApiException {

    public BadRequestException(String message) {
        super(message);
    }

}