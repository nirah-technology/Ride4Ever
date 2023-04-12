package io.nirahtech.ride4ever.core.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class NotImplementedException extends UnsupportedOperationException {

    private static final long serialVersionUID = -11065121547050976L;
    
    /**
     * 
     */
    public NotImplementedException() {
        super("Not yet implemented.");
    }
}
