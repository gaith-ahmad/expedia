
package com.digisolfze.expedia.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currencyCode",
    "flightTotalBaseFare",
    "flightTotalTax",
    "flightTotalPrice",
    "flightPerPsgrBaseFare",
    "flightPerPsgrTax",
    "flightPerPsgrBaseFarePlusTax",
    "flightPerPsgrTotalPrice",
    "trendAgcyFlightPrice",
    "pctChangeFromTrend",
    "formattedTotalPriceValue"
})

public class FlightPricingInfo {

    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("flightTotalBaseFare")
    private Double flightTotalBaseFare;
    @JsonProperty("flightTotalTax")
    private Double flightTotalTax;
    @JsonProperty("flightTotalPrice")
    private Double flightTotalPrice;
    @JsonProperty("flightPerPsgrBaseFare")
    private Double flightPerPsgrBaseFare;
    @JsonProperty("flightPerPsgrTax")
    private Double flightPerPsgrTax;
    @JsonProperty("flightPerPsgrBaseFarePlusTax")
    private Double flightPerPsgrBaseFarePlusTax;
    @JsonProperty("flightPerPsgrTotalPrice")
    private Double flightPerPsgrTotalPrice;
    @JsonProperty("trendAgcyFlightPrice")
    private Double trendAgcyFlightPrice;
    @JsonProperty("pctChangeFromTrend")
    private Double pctChangeFromTrend;
    @JsonProperty("formattedTotalPriceValue")
    private String formattedTotalPriceValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("flightTotalBaseFare")
    public Double getFlightTotalBaseFare() {
        return flightTotalBaseFare;
    }

    @JsonProperty("flightTotalBaseFare")
    public void setFlightTotalBaseFare(Double flightTotalBaseFare) {
        this.flightTotalBaseFare = flightTotalBaseFare;
    }

    @JsonProperty("flightTotalTax")
    public Double getFlightTotalTax() {
        return flightTotalTax;
    }

    @JsonProperty("flightTotalTax")
    public void setFlightTotalTax(Double flightTotalTax) {
        this.flightTotalTax = flightTotalTax;
    }

    @JsonProperty("flightTotalPrice")
    public Double getFlightTotalPrice() {
        return flightTotalPrice;
    }

    @JsonProperty("flightTotalPrice")
    public void setFlightTotalPrice(Double flightTotalPrice) {
        this.flightTotalPrice = flightTotalPrice;
    }

    @JsonProperty("flightPerPsgrBaseFare")
    public Double getFlightPerPsgrBaseFare() {
        return flightPerPsgrBaseFare;
    }

    @JsonProperty("flightPerPsgrBaseFare")
    public void setFlightPerPsgrBaseFare(Double flightPerPsgrBaseFare) {
        this.flightPerPsgrBaseFare = flightPerPsgrBaseFare;
    }

    @JsonProperty("flightPerPsgrTax")
    public Double getFlightPerPsgrTax() {
        return flightPerPsgrTax;
    }

    @JsonProperty("flightPerPsgrTax")
    public void setFlightPerPsgrTax(Double flightPerPsgrTax) {
        this.flightPerPsgrTax = flightPerPsgrTax;
    }

    @JsonProperty("flightPerPsgrBaseFarePlusTax")
    public Double getFlightPerPsgrBaseFarePlusTax() {
        return flightPerPsgrBaseFarePlusTax;
    }

    @JsonProperty("flightPerPsgrBaseFarePlusTax")
    public void setFlightPerPsgrBaseFarePlusTax(Double flightPerPsgrBaseFarePlusTax) {
        this.flightPerPsgrBaseFarePlusTax = flightPerPsgrBaseFarePlusTax;
    }

    @JsonProperty("flightPerPsgrTotalPrice")
    public Double getFlightPerPsgrTotalPrice() {
        return flightPerPsgrTotalPrice;
    }

    @JsonProperty("flightPerPsgrTotalPrice")
    public void setFlightPerPsgrTotalPrice(Double flightPerPsgrTotalPrice) {
        this.flightPerPsgrTotalPrice = flightPerPsgrTotalPrice;
    }

    @JsonProperty("trendAgcyFlightPrice")
    public Double getTrendAgcyFlightPrice() {
        return trendAgcyFlightPrice;
    }

    @JsonProperty("trendAgcyFlightPrice")
    public void setTrendAgcyFlightPrice(Double trendAgcyFlightPrice) {
        this.trendAgcyFlightPrice = trendAgcyFlightPrice;
    }

    @JsonProperty("pctChangeFromTrend")
    public Double getPctChangeFromTrend() {
        return pctChangeFromTrend;
    }

    @JsonProperty("pctChangeFromTrend")
    public void setPctChangeFromTrend(Double pctChangeFromTrend) {
        this.pctChangeFromTrend = pctChangeFromTrend;
    }

    @JsonProperty("formattedTotalPriceValue")
    public String getFormattedTotalPriceValue() {
        return formattedTotalPriceValue;
    }

    @JsonProperty("formattedTotalPriceValue")
    public void setFormattedTotalPriceValue(String formattedTotalPriceValue) {
        this.formattedTotalPriceValue = formattedTotalPriceValue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
