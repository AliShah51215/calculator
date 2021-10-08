package currency_converter;

import externalService.ExchangeRate;

import java.math.BigDecimal;

record CurrencyCalculator(ExchangeRate exchangeRate) {

    public BigDecimal calculateSellingRate(BigDecimal amountInPLN, Currency currency) {
        BigDecimal sellingRate = exchangeRate.getSellingRate(currency);
        return sellingRate.multiply(amountInPLN);
    }

    public BigDecimal calculateBuyingRate(BigDecimal amountInPLN, Currency currency) {
        BigDecimal buyingRate = exchangeRate.getBuyingRate(currency);
        return buyingRate.multiply(amountInPLN);
    }
}
