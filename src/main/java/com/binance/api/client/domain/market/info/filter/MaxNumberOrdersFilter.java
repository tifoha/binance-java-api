package com.binance.api.client.domain.market.info.filter;

/**
 * The MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on a symbol.
 * Note that both "algo" orders and normal orders are counted for this filter.
 */
public class MaxNumberOrdersFilter implements Filter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
