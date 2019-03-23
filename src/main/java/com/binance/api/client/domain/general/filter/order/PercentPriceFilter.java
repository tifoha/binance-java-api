package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.math.BigDecimal;

/**
 * The PERCENT_PRICE filter defines valid range for a price based on the average of the previous trades. avgPriceMins is the number of minutes the average price is calculated over. 0 means the last price is used.
 * In order to pass the percent price, the following must be true for price:
 * price <= weightedAveragePrice * multiplierUp
 * price >= weightedAveragePrice * multiplierDown
 */
@JsonTypeName("PERCENT_PRICE")
public class PercentPriceFilter implements SymbolFilter {
    private BigDecimal multiplierUp;
    private BigDecimal multiplierDown;
    private int avgPriceMins;

    public BigDecimal getMultiplierUp() {
        return multiplierUp;
    }

    public void setMultiplierUp(BigDecimal multiplierUp) {
        this.multiplierUp = multiplierUp;
    }

    public BigDecimal getMultiplierDown() {
        return multiplierDown;
    }

    public void setMultiplierDown(BigDecimal multiplierDown) {
        this.multiplierDown = multiplierDown;
    }

    public int getAvgPriceMins() {
        return avgPriceMins;
    }

    public void setAvgPriceMins(int avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
    }

    @Override
    public void validate(NewOrder newOrder) throws HighPriceException, LowPriceException, StepPriceException {
        // TODO: 17.02.2019 implement
//        BigDecimal price = newOrder.getPrice();
//        if (price.compareTo(multiplierDown) > 0) {
//            throw new HighPriceException(multiplierDown, price);
//        }
//
//        if (price.compareTo(multiplierUp) < 0) {
//            throw new LowPriceException(multiplierDown, price);
//        }
//
//        if (ZERO.compareTo(price.divideAndRemainder(avgPriceMins)[1]) != 0) {
//            throw new StepPriceException(multiplierDown, price);
//        }
    }

    @Override
    public String toString() {
        return "PriceFilter{" +
                "multiplierUp=" + multiplierUp +
                ", multiplierDown=" + multiplierDown +
                ", avgPriceMins=" + avgPriceMins +
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
