package br.com.conversor;

import com.google.gson.annotations.SerializedName;

public class Valor {


    @SerializedName("base_code")
    private String baseCurrency;

    @SerializedName("target_code")
    private String targetCurrency;

    @SerializedName("conversion_rate")
    private double conversionRate;

    public double converterAmount(double quantia)
    {
        return this.conversionRate * quantia;
    }

    public String getBaseCurrency()
    {
        return baseCurrency;
    }

    public String getTargetCurrency()
    {
        return targetCurrency;
    }

    public double getConversionRate()
    {
        return conversionRate;
    }
}
