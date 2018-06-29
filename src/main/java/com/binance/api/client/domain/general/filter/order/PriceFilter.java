package com.binance.api.client.domain.general.filter.order;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.math.BigDecimal;

/**
 * The PRICE_FILTER defines the price rules for a symbol. There are 3 parts:
 *
 * minPrice defines the minimum price/stopPrice allowed.
 * maxPrice defines the maximum price/stopPrice allowed.
 * tickSize defines the intervals that a price/stopPrice can be increased/decreased by.
 * In order to pass the price filter, the following must be true for price/stopPrice:
 *
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
}
