package com.binance.api.client.domain.market.info;

public class RateLimit {
    private String rateLimitType;
    private Interval interval;
    private long limit;

    public String getRateLimitType() {
        return rateLimitType;
    }

    public void setRateLimitType(String rateLimitType) {
        this.rateLimitType = rateLimitType;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public enum Type {
        REQUESTS,
        ORDERS
    }

    public enum Interval {
        SECOND,
        MINUTE,
        DAY
    }
}
