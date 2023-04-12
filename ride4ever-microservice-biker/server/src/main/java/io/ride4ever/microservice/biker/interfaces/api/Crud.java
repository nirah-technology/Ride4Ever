package io.ride4ever.microservice.biker.interfaces.api;

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
