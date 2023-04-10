package io.nirahtech.ride4ever.bikers.server.infrastructure;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.nirahtech.ride4ever.bikers.server.Page;
import io.nirahtech.ride4ever.core.requesting.Pageable;
import io.nirahtech.ride4ever.core.requesting.SortOrder;

public final class HttpUtils {
    
    private HttpUtils() {

    }

    public static final Optional<Pageable> extractPageFromQuery(final Map<String, List<String>> querySearch) {
        Optional<Pageable> page = Optional.empty();
        if (querySearch.containsKey("page") && querySearch.containsKey("size") && querySearch.containsKey("order")) {
            page = Optional.of(new Page(
                Integer.parseInt(querySearch.get("page").get(0)),
                Integer.parseInt(querySearch.get("size").get(0)),
                SortOrder.valueOf(querySearch.get("order").get(0))
            ));
        }
        return page;
    }
}
