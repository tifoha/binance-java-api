package com.binance.api.client.domain.market.info.filter;

import java.math.BigDecimal;

/**
 * The MIN_NOTIONAL filter defines the minimum notional value allowed for an order on a symbol.
 * An order's notional value is the price * quantity.
 */
public class MinNotionalFilter implements Filter {
    private BigDecimal minNotional;

    public BigDecimal getMinNotional() {
        return minNotional;
    }

    public void setMinNotional(BigDecimal minNotional) {
        this.minNotional = minNotional;
    }
}
