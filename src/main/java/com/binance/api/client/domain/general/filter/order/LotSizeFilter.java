package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * The LOT_SIZE filter defines the quantity (aka "lots" in auction terms) rules for a symbol. There are 3 parts:
 * <p>
 * minQty defines the minimum quantity/icebergQty allowed.
 * maxQty defines the maximum quantity/icebergQty allowed.
 * stepSize defines the intervals that a quantity/icebergQty can be increased/decreased by.
 * In order to pass the lot size, the following must be true for quantity/icebergQty:
 * <p>
 * quantity >= minQty
 * quantity <= maxQty
 * (quantity-minQty) % stepSize == 0
 */
public class LotSizeFilter implements SymbolFilter {
    private BigDecimal minQty;
    private BigDecimal maxQty;
    private BigDecimal stepSize;

    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    public BigDecimal getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(BigDecimal maxQty) {
        this.maxQty = maxQty;
    }

    public BigDecimal getStepSize() {
        return stepSize;
    }

    public void setStepSize(BigDecimal stepSize) {
        this.stepSize = stepSize;
    }

    @Override
    public void validate(NewOrder newOrder) throws HighQuantityException, LowQuantityException, StepQuantityException {
        BigDecimal qty = newOrder.getQuantity();
        if (qty.compareTo(maxQty) > 0) {
            throw new HighQuantityException(maxQty, qty);
        }

        if (qty.compareTo(minQty) < 0) {
            throw new LowQuantityException(maxQty, qty);
        }

        if (ZERO.compareTo(qty.divideAndRemainder(stepSize)[1]) != 0) {
            throw new StepQuantityException(stepSize, qty);
        }
    }

    @Override
    public boolean test(NewOrder newOrder) {
        try {
            validate(newOrder);
            return true;
        } catch (NewOrderValidationException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "LotSizeFilter{" +
                "minQty=" + minQty +
                ", maxQty=" + maxQty +
                ", stepSize=" + stepSize +
                '}';
    }

    public static class HighQuantityException extends NewOrderValidationException {
        public HighQuantityException(BigDecimal expected, BigDecimal actual) {
            super(expected, actual);
        }

        public BigDecimal getExpected() {
            return (BigDecimal) expected;
        }

        public BigDecimal getActual() {
            return (BigDecimal) actual;
        }
    }

    public static class LowQuantityException extends NewOrderValidationException {
        public LowQuantityException(BigDecimal expected, BigDecimal actual) {
            super(expected, actual);
        }

        public BigDecimal getExpected() {
            return (BigDecimal) expected;
        }

        public BigDecimal getActual() {
            return (BigDecimal) actual;
        }
    }

    public static class StepQuantityException extends NewOrderValidationException {
        public StepQuantityException(BigDecimal expected, BigDecimal actual) {
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
