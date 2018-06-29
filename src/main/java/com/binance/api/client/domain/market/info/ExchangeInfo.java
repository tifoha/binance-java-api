package com.binance.api.client.domain.market.info;

import com.binance.api.client.domain.market.info.filter.Filter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExchangeInfo {
    private String timezone;
    private long serverTime;
    private List<RateLimit> rateLimits;
    private List<Filter> exchangeFilters;
    @JsonProperty("symbols")
    private List<CurrencyPairInfo> currencyPairs;

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

    public List<CurrencyPairInfo> getCurrencyPairs() {
        return currencyPairs;
    }

    public void setCurrencyPairs(List<CurrencyPairInfo> currencyPairs) {
        this.currencyPairs = currencyPairs;
    }

    public List<Filter> getExchangeFilters() {
        return exchangeFilters;
    }

    public void setExchangeFilters(List<Filter> exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
    }
}
