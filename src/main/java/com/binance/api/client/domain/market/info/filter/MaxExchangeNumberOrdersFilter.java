package com.binance.api.client.domain.market.info.filter;

/**
 * The EXCHANGE_MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on the exchange.
 * Note that both "algo" orders and normal orders are counted for this filter.
 */
public class MaxExchangeNumberOrdersFilter implements Filter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
