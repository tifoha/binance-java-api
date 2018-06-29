package com.binance.api.client.domain.general.filter;

import com.binance.api.client.domain.general.filter.exchange.MaxAlgorithmOrdersExchangeFilter;
import com.binance.api.client.domain.general.filter.exchange.MaxNumberOrdersExchangeFilter;
import com.binance.api.client.domain.general.filter.order.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "filterType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PriceFilter.class, name = "PRICE_FILTER"),
        @JsonSubTypes.Type(value = LotSizeFilter.class, name = "LOT_SIZE"),
        @JsonSubTypes.Type(value = MinNotionalFilter.class, name = "MIN_NOTIONAL"),
        @JsonSubTypes.Type(value = MaxNumberOrdersFilter.class, name = "MAX_NUM_ORDERS"),
        @JsonSubTypes.Type(value = MaxAlgorithmOrdersFilter.class, name = "MAX_ALGO_ORDERS"),
        @JsonSubTypes.Type(value = MaxNumberOrdersExchangeFilter.class, name = "EXCHANGE_MAX_NUM_ORDERS"),
        @JsonSubTypes.Type(value = MaxAlgorithmOrdersExchangeFilter.class, name = "EXCHANGE_MAX_ALGO_ORDERS")
})
public interface Filter {
}
