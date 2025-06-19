package br.com.conversor;

import com.google.gson.Gson;

public class CurrencyJsonParser {
    public Valor getJson(String json)  {
        try {
            Gson gson = new Gson();
            return gson.fromJson(json, Valor.class);
        } catch (Exception e) {
            System.err.println("Erro ao converter os dados da API: " +e.getMessage());
            return null;
        }
    }
}
