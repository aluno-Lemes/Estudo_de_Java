package br.com.conversor;

import java.io.IOException;


public class ExchangeApiService {


    private final ExchangeApiClient apiClient;
    private final CurrencyJsonParser parser;


    public ExchangeApiService(ExchangeApiClient apiClient, CurrencyJsonParser parser) {
        this.apiClient = apiClient;
        this.parser = parser;
    }

    public Valor convertCurrency(String baseCode, String targetCode, double quantia) throws IOException, InterruptedException {
        String response = apiClient.getBody(baseCode, targetCode, quantia);
        return parser.getJson(response);
    }

}
