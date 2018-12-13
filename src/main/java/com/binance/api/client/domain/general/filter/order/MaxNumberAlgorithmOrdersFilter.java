package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;

/**
 * The MAX_NUM_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on a symbol.
 * "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
public class MaxNumberAlgorithmOrdersFilter implements SymbolFilter {
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void validate(NewOrder newOrder) throws NewOrderValidationException {
        // TODO: 10.07.2018 implement
    }

    @Override
    public String toString() {
        return "MaxNumberAlgorithmOrdersFilter{" +
                "limit=" + limit +
                '}';
    }
}
