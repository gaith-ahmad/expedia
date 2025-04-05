
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
    "perPsgrPackagePrice",
    "totalPackagePrice",
    "perPsgrSavings",
    "totalSavings",
    "percentSavings",
    "savingsPctOfHotel",
    "savingsPctOfFlight",
    "formattedPerPassengerPackagePrice",
    "formattedTotalPriceValue"
})

public class PackagePricingInfo {

    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("perPsgrPackagePrice")
    private Double perPsgrPackagePrice;
    @JsonProperty("totalPackagePrice")
    private Double totalPackagePrice;
    @JsonProperty("perPsgrSavings")
    private Double perPsgrSavings;
    @JsonProperty("totalSavings")
    private Double totalSavings;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("savingsPctOfHotel")
    private Double savingsPctOfHotel;
    @JsonProperty("savingsPctOfFlight")
    private Double savingsPctOfFlight;
    @JsonProperty("formattedPerPassengerPackagePrice")
    private String formattedPerPassengerPackagePrice;
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

    @JsonProperty("perPsgrPackagePrice")
    public Double getPerPsgrPackagePrice() {
        return perPsgrPackagePrice;
    }

    @JsonProperty("perPsgrPackagePrice")
    public void setPerPsgrPackagePrice(Double perPsgrPackagePrice) {
        this.perPsgrPackagePrice = perPsgrPackagePrice;
    }

    @JsonProperty("totalPackagePrice")
    public Double getTotalPackagePrice() {
        return totalPackagePrice;
    }

    @JsonProperty("totalPackagePrice")
    public void setTotalPackagePrice(Double totalPackagePrice) {
        this.totalPackagePrice = totalPackagePrice;
    }

    @JsonProperty("perPsgrSavings")
    public Double getPerPsgrSavings() {
        return perPsgrSavings;
    }

    @JsonProperty("perPsgrSavings")
    public void setPerPsgrSavings(Double perPsgrSavings) {
        this.perPsgrSavings = perPsgrSavings;
    }

    @JsonProperty("totalSavings")
    public Double getTotalSavings() {
        return totalSavings;
    }

    @JsonProperty("totalSavings")
    public void setTotalSavings(Double totalSavings) {
        this.totalSavings = totalSavings;
    }

    @JsonProperty("percentSavings")
    public Double getPercentSavings() {
        return percentSavings;
    }

    @JsonProperty("percentSavings")
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    @JsonProperty("savingsPctOfHotel")
    public Double getSavingsPctOfHotel() {
        return savingsPctOfHotel;
    }

    @JsonProperty("savingsPctOfHotel")
    public void setSavingsPctOfHotel(Double savingsPctOfHotel) {
        this.savingsPctOfHotel = savingsPctOfHotel;
    }

    @JsonProperty("savingsPctOfFlight")
    public Double getSavingsPctOfFlight() {
        return savingsPctOfFlight;
    }

    @JsonProperty("savingsPctOfFlight")
    public void setSavingsPctOfFlight(Double savingsPctOfFlight) {
        this.savingsPctOfFlight = savingsPctOfFlight;
    }

    @JsonProperty("formattedPerPassengerPackagePrice")
    public String getFormattedPerPassengerPackagePrice() {
        return formattedPerPassengerPackagePrice;
    }

    @JsonProperty("formattedPerPassengerPackagePrice")
    public void setFormattedPerPassengerPackagePrice(String formattedPerPassengerPackagePrice) {
        this.formattedPerPassengerPackagePrice = formattedPerPassengerPackagePrice;
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
