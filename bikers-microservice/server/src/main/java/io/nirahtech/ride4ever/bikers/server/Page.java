package io.nirahtech.ride4ever.bikers.server;

import io.nirahtech.ride4ever.core.requesting.Pageable;
import io.nirahtech.ride4ever.core.requesting.SortOrder;

public final class Page implements Pageable {

    private final int page;
    private final int size;
    private final SortOrder order;

    public Page(final int page, final int size, final SortOrder order) {
        this.page = page;
        this.size = size;
        this.order = order;
    }

    @Override
    public int getPage() {
        return this.page;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public SortOrder getOrder() {
        return this.order;
    }
    
}
