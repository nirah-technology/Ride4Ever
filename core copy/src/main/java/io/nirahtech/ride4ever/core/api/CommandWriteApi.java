package io.nirahtech.ride4ever.core.api;

import java.util.Optional;

public interface CommandWriteApi<T> {
    Optional<T> update(T entity);
}
