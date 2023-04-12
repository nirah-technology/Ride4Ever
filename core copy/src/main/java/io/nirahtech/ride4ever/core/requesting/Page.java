package io.nirahtech.ride4ever.core.requesting;

public class Page implements Pageable {
    private final int page;
    private final int size;
    private final SortOrder order;
    
    public Page(int page, int size, SortOrder order) {
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
