package com.binance.api.client.domain.market.info;

import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.market.info.filter.Filter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CurrencyPairInfo {
    private String symbol;
    private String status;
    @JsonProperty("quoteAsset")
    private String base;
    @JsonProperty("quotePrecision")
    private int basePrecision;
    @JsonProperty("baseAsset")
    private String quote;
    @JsonProperty("baseAssetPrecision")
    private int quotePrecision;
    private Set<OrderType> orderTypes;
    private boolean icebergAllowed;
    private List<Filter> filters;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getBasePrecision() {
        return basePrecision;
    }

    public void setBasePrecision(int basePrecision) {
        this.basePrecision = basePrecision;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getQuotePrecision() {
        return quotePrecision;
    }

    public void setQuotePrecision(int quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    public Set<OrderType> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(Set<OrderType> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public boolean isIcebergAllowed() {
        return icebergAllowed;
    }

    public void setIcebergAllowed(boolean icebergAllowed) {
        this.icebergAllowed = icebergAllowed;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
