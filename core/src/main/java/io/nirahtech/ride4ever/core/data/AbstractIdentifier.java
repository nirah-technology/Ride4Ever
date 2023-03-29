package io.nirahtech.ride4ever.core.data;

abstract class AbstractIdentifier<T> implements Identifiable<T> {
    protected final T identifier;

    protected AbstractIdentifier(final T identifier) {
        this.identifier = identifier;
    }

    @Override
    public final T getIdentifier() {
        return this.identifier;
    }
}
