package io.nirahtech.ride4ever.core.interfaces.api;

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
     * @return The entity that's have the given ID, else null.
     */
    public T read(Long identifier);
    
    /**
     * Update the entity that contains the given ID. New value will be the given entity.
     * @param identifier ID of the entity to update.
     * @param entity New value of the entity.
     * @return Updated entity.
     */
    public T update(Long identifier, T entity);
    
    /**
     * Delete the entity that contains the given ID.
     * @param identifier ID of the entity to delete.
     */
    public void delete(Long identifier);
}
