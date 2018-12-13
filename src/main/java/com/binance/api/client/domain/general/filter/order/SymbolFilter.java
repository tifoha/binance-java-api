package com.binance.api.client.domain.general.filter.order;

import com.binance.api.client.domain.account.NewOrder;
import com.binance.api.client.domain.general.filter.Filter;

import java.util.function.Predicate;

public interface SymbolFilter extends Filter, Predicate<NewOrder> {

    void validate(NewOrder newOrder) throws LotSizeFilter.NewOrderValidationException;

    @Override
    default boolean test(NewOrder newOrder) {
        try {
            validate(newOrder);
            return true;
        } catch (NewOrderValidationException e) {
            return false;
        }
    }

    ;

    abstract class NewOrderValidationException extends Exception {
        protected final Object expected;
        protected final Object actual;

        protected NewOrderValidationException(Object expected, Object actual) {
            this.expected = expected;
            this.actual = actual;
        }
    }
}
