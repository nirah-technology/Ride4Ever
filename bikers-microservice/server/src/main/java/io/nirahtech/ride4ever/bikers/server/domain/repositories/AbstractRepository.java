package io.nirahtech.ride4ever.bikers.server.domain.repositories;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.core.api.CommandWriteApi;
import io.nirahtech.ride4ever.core.api.QueryReadOnlyApi;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.requesting.Pageable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public abstract class AbstractRepository<T, I> implements QueryReadOnlyApi<T, I>, CommandWriteApi<T> {
    protected final EntityManager entityManager;
    private final Class<? extends T> managedClass;

    protected AbstractRepository(Class<? extends T> managedClass) {
        this.managedClass = managedClass;
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Stream<T> findAll(Set<PropertyCondition> filters, Pageable page) {
        // TODO Auto-generated method stub
        return Stream.empty();
    }

    @Override
    public Optional<T> findById(I id) {
        return Optional.ofNullable(this.entityManager.find(this.managedClass, id));
    }

    public void save(T entity) {
        EntityTransaction transaction = this.entityManager.getTransaction();
        transaction.begin();
        this.entityManager.persist(entity);
        transaction.commit();
    }

    @Override
    public Optional<T> update(T entity) {
        EntityTransaction transaction = this.entityManager.getTransaction();
        Optional<T> updatedEntity = Optional.empty();
        if (entity != null) {
            this.save(entity);
            updatedEntity = Optional.of(entity);
        }        
        return updatedEntity;
    }
}
