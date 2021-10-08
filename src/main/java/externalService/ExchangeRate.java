package externalService;
import currency_converter.Currency;

import java.math.BigDecimal;

public interface ExchangeRate {
    BigDecimal getBuyingRate(Currency currency);
    BigDecimal getSellingRate(Currency currency);
}
