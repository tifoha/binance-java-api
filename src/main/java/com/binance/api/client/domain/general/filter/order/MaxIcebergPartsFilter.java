package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;

/**
 * The ICEBERG_PARTS filter defines the maximum number of orders an account is allowed to have open on a symbol.
 * Note that both "algo" orders and normal orders are counted for this filter.
 */
public class MaxIcebergPartsFilter implements SymbolFilter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void validate(NewOrder newOrder) {
        // TODO: 10.07.2018 Implement
    }

    @Override
    public String toString() {
        return "MaxNumberOrdersFilter{" +
                "limit=" + limit +
                '}';
    }
}
