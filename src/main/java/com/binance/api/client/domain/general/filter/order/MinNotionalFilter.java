package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * The MIN_NOTIONAL filter defines the minimum notional value allowed for an order on a symbol.
 * An order's notional value is the price * quantity.
 */
public class MinNotionalFilter implements SymbolFilter {
    public static final MathContext MC = new MathContext(15);

    private BigDecimal minNotional;
    private boolean applyToMarket;
    private int avgPriceMins;

    public BigDecimal getMinNotional() {
        return minNotional;
    }

    public void setMinNotional(BigDecimal minNotional) {
        this.minNotional = minNotional;
    }

    @Override
    public void validate(NewOrder newOrder) throws NewOrderValidationException {
        BigDecimal total = newOrder.getPrice().multiply(newOrder.getQuantity(), MC);

        if (total.compareTo(minNotional) < 0) {
            throw new LowNotionException(minNotional, total);
        }
    }

    public boolean isApplyToMarket() {
        return applyToMarket;
    }

    public void setApplyToMarket(boolean applyToMarket) {
        this.applyToMarket = applyToMarket;
    }

    public int getAvgPriceMins() {
        return avgPriceMins;
    }

    public void setAvgPriceMins(int avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
    }

    @Override
    public String toString() {
        return "MinNotionalFilter{" +
                "minNotional=" + minNotional +
                '}';
    }

    public static class LowNotionException extends NewOrderValidationException {
        public LowNotionException(BigDecimal expected, BigDecimal actual) {
            super(expected, actual);
        }

        public BigDecimal getExpected() {
            return (BigDecimal) expected;
        }

        public BigDecimal getActual() {
            return (BigDecimal) actual;
        }
    }
}
