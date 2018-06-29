package com.binance.api.client.domain.general.filter.exchange;

import com.binance.api.client.domain.general.filter.Filter;

/**
 * The EXCHANGE_MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on the exchange.
 * "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
public class MaxAlgorithmOrdersExchangeFilter implements ExchangeFilter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
