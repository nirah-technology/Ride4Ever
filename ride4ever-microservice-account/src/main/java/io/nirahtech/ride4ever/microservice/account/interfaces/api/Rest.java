package io.nirahtech.ride4ever.microservice.account.interfaces.api;

/**
 * Rest
 */
public interface Rest<T> {

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
    public T read(String identifier);
    
    /**
     * 
     * @param entity
     */
    public T update(String identifier, T entity);
    
    /**
     * 
     * @param identifier
     */
    public void delete(String identifier);
}