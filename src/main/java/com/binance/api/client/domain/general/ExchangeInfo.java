package com.binance.api.client.domain.general;

import com.binance.api.client.domain.general.filter.exchange.ExchangeFilter;

import java.util.List;

public class ExchangeInfo {

    private String timezone;

    private long serverTime;

    private List<RateLimit> rateLimits;

    private List<ExchangeFilter> exchangeFilters;

    private List<SymbolInfo> symbols;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public long getServerTime() {
        return serverTime;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    public List<RateLimit> getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
    }

    public List<SymbolInfo> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<SymbolInfo> symbols) {
        this.symbols = symbols;
    }

    public List<ExchangeFilter> getExchangeFilters() {
        return exchangeFilters;
    }

    public void setExchangeFilters(List<ExchangeFilter> exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
    }
}
