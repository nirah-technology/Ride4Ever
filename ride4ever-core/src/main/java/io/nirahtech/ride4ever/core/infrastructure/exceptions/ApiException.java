package io.nirahtech.ride4ever.core.infrastructure.exceptions;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = -2622745953165837252L;

    /**
     * 
     */
    public ApiException() {
        super();
    }

    /**
     * 
     * @param message Message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * 
     * @param cause Cause
     */
    public ApiException(Throwable cause) {
        super(cause);
    }

    /**
     * 
     * @param message Message
     * @param cause Cause
     */
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 
     * @param message Message
     * @param cause Cause
     * @param enableSuppression Enable suppression
     * @param writableStackTrace Is Stack Trace writable
     */
    public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
