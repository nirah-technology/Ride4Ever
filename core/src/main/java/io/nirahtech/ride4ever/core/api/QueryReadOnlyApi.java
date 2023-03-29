package io.nirahtech.ride4ever.core.api;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public interface QueryReadOnlyApi<T, I> {
    Stream<T> findAll(final Set<PropertyCondition> filters, final Pageable page);
    Optional<T> findById(final I id);

}
