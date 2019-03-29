package com.binance.api.client.domain.general;

import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.general.filter.order.PriceFilter;
import com.binance.api.client.domain.general.filter.order.SymbolFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public class SymbolInfo {
    @JsonProperty
    private String symbol;

    @JsonProperty
    private SymbolStatus status;

    @JsonProperty("quoteAsset")
    private String base;

    @JsonProperty("quotePrecision")
    private int basePrecision;

    @JsonProperty("baseAsset")
    private String quote;

    @JsonProperty("baseAssetPrecision")
    private int quotePrecision;

    @JsonProperty
    private Set<OrderType> orderTypes;

    @JsonProperty
    private boolean icebergAllowed;

    @JsonProperty
    private boolean isSpotTradingAllowed;

    @JsonProperty
    private boolean isMarginTradingAllowed;

    @JsonProperty
    private List<SymbolFilter> filters;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public SymbolStatus getStatus() {
        return status;
    }

    public void setStatus(SymbolStatus status) {
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

    public boolean isSpotTradingAllowed() {
        return isSpotTradingAllowed;
    }

    public void setSpotTradingAllowed(boolean spotTradingAllowed) {
        isSpotTradingAllowed = spotTradingAllowed;
    }

    public boolean isMarginTradingAllowed() {
        return isMarginTradingAllowed;
    }

    public void setMarginTradingAllowed(boolean marginTradingAllowed) {
        isMarginTradingAllowed = marginTradingAllowed;
    }

    public List<SymbolFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<SymbolFilter> filters) {
        this.filters = filters;
    }

    public PriceFilter getFilter(FilterType filterType) {
        return null;
    }
}
