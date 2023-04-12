package io.nirahtech.ride4ever.core.business.api;

import java.util.Optional;

/**
 * Interface that represents a CRUD contract.
 * 
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface Crud<T> {

    /**
     * Create a new entity.
     * @param entity Entity to create.
     */
    public T create(T entity);
    
    /**
     * Find an entity from it's ID.
     * @param identifier ID of the entity to find.
     * @return The entity that's have the given ID.
     */
    public Optional<T> read(Long identifier);
    
    /**
     * Update the entity.
     * @param entity New value of the entity.
     * @return Updated entity.
     */
    public T update(T entity);
    
    /**
     * Delete the entity that contains the given ID.
     * @param identifier ID of the entity to delete.
     */
    public void delete(Long identifier);
}
