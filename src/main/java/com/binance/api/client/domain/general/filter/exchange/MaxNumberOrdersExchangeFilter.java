package com.binance.api.client.domain.general.filter.exchange;

import com.binance.api.client.domain.general.filter.Filter;

/**
 * The EXCHANGE_MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on the exchange.
 * Note that both "algo" orders and normal orders are counted for this filter.
 */
public class MaxNumberOrdersExchangeFilter implements ExchangeFilter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
