package com.binance.api.client.domain.market.info.filter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "filterType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PriceFilter.class, name = "PRICE_FILTER"),
        @JsonSubTypes.Type(value = LotSizeFilter.class, name = "LOT_SIZE"),
        @JsonSubTypes.Type(value = MinNotionalFilter.class, name = "MIN_NOTIONAL"),
        @JsonSubTypes.Type(value = MaxNumberOrdersFilter.class, name = "MAX_NUM_ORDERS"),
        @JsonSubTypes.Type(value = MaxAlgorithmOrdersFilter.class, name = "MAX_ALGO_ORDERS"),
        @JsonSubTypes.Type(value = MaxExchangeNumberOrdersFilter.class, name = "EXCHANGE_MAX_NUM_ORDERS"),
        @JsonSubTypes.Type(value = MaxExchangeAlgorithmOrdersFilter.class, name = "EXCHANGE_MAX_ALGO_ORDERS")
})
public interface Filter {
}
