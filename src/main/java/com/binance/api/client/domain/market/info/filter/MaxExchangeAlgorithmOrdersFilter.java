package com.binance.api.client.domain.market.info.filter;

/**
 * The EXCHANGE_MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on the exchange.
 * "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
public class MaxExchangeAlgorithmOrdersFilter implements Filter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
