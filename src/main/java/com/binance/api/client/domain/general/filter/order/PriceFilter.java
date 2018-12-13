package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * The PRICE_FILTER defines the price rules for a symbol. There are 3 parts:
 * <p>
 * minPrice defines the minimum price/stopPrice allowed.
 * maxPrice defines the maximum price/stopPrice allowed.
 * tickSize defines the intervals that a price/stopPrice can be increased/decreased by.
 * In order to pass the price filter, the following must be true for price/stopPrice:
 * <p>
 * price >= minPrice
 * price <= maxPrice
 * (price-minPrice) % tickSize == 0
 */
@JsonTypeName("PRICE_FILTER")
public class PriceFilter implements SymbolFilter {
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private BigDecimal tickSize;

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getTickSize() {
        return tickSize;
    }

    public void setTickSize(BigDecimal tickSize) {
        this.tickSize = tickSize;
    }

    @Override
    public void validate(NewOrder newOrder) throws HighPriceException, LowPriceException, StepPriceException {
        BigDecimal price = newOrder.getPrice();
        if (price.compareTo(maxPrice) > 0) {
            throw new HighPriceException(maxPrice, price);
        }

        if (price.compareTo(minPrice) < 0) {
            throw new LowPriceException(maxPrice, price);
        }

        if (ZERO.compareTo(price.divideAndRemainder(tickSize)[1]) != 0) {
            throw new StepPriceException(maxPrice, price);
        }
    }

    @Override
    public String toString() {
        return "PriceFilter{" +
                "minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", tickSize=" + tickSize +
                '}';
    }

    public static class HighPriceException extends NewOrderValidationException {
        public HighPriceException(BigDecimal expected, BigDecimal actual) {
            super(expected, actual);
        }

        public BigDecimal getExpected() {
            return (BigDecimal) expected;
        }

        public BigDecimal getActual() {
            return (BigDecimal) actual;
        }
    }

    public static class LowPriceException extends NewOrderValidationException {
        public LowPriceException(BigDecimal expected, BigDecimal actual) {
            super(expected, actual);
        }

        public BigDecimal getExpected() {
            return (BigDecimal) expected;
        }

        public BigDecimal getActual() {
            return (BigDecimal) actual;
        }
    }

    public static class StepPriceException extends NewOrderValidationException {
        public StepPriceException(BigDecimal expected, BigDecimal actual) {
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
