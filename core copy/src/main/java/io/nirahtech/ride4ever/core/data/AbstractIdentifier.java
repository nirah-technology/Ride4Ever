package io.nirahtech.ride4ever.core.data;

public abstract class AbstractIdentifier<T> implements Identifiable<T> {

    protected T identifier;

    protected AbstractIdentifier(final T identifier) {
        this.identifier = identifier;
    }

    public AbstractIdentifier() {

    }

    @Override
    public T getIdentifier() {
        return this.identifier;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractIdentifier<T> other = (AbstractIdentifier) obj;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        return true;
    }

    
}
