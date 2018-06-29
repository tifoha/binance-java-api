package com.binance.api.client.domain.general.filter.order;

import java.math.BigDecimal;

/**
 * The LOT_SIZE filter defines the quantity (aka "lots" in auction terms) rules for a symbol. There are 3 parts:
 *
 * minQty defines the minimum quantity/icebergQty allowed.
 * maxQty defines the maximum quantity/icebergQty allowed.
 * stepSize defines the intervals that a quantity/icebergQty can be increased/decreased by.
 * In order to pass the lot size, the following must be true for quantity/icebergQty:
 *
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
}
