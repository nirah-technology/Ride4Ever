package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;

public interface Identifiable<T> extends Serializable {
    T getIdentifier();
}
