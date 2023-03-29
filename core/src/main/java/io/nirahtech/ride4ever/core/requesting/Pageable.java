package io.nirahtech.ride4ever.core.requesting;

public interface Pageable {
    int getPage();
    int getSize();
    SortOrder getOrder();
}
