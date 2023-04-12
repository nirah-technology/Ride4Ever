package io.nirahtech.ride4ever.microservice.account.business.api;

import java.util.Optional;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface Crud<T> {

    /**
     * 
     * @param entity
     */
    public T create(T entity);
    
    /**
     * 
     * @param identifier
     * @return
     */
    public Optional<T> read(String identifier);
    
    /**
     * 
     * @param entity
     */
    public T update(T entity);
    
    /**
     * 
     * @param identifier
     */
    public void delete(String identifier);
}
