package io.nirahtech.ride4ever.core.infrastructure.exceptions;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public class MalformatedConfigurationFileException extends ApiException {

    /**
     *
     */
    private static final long serialVersionUID = 3319729159492087319L;
   
    public MalformatedConfigurationFileException() {
        super("Invalid configuration file content.");
    }

}
