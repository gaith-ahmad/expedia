
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
    "hotelPerPsgrBaseRate",
    "hotelPerPsgrTaxesAndFees",
    "hotelPerPsgrTotalRate",
    "hotelTotalBaseRate",
    "hotelTotalTaxesAndFees",
    "hotelTotalRate",
    "currency",
    "formattedTotalPriceValue",
    "displayAveragePrice",
    "drr"
})

public class HotelPricingInfo {

    @JsonProperty("hotelPerPsgrBaseRate")
    private Double hotelPerPsgrBaseRate;
    @JsonProperty("hotelPerPsgrTaxesAndFees")
    private Double hotelPerPsgrTaxesAndFees;
    @JsonProperty("hotelPerPsgrTotalRate")
    private Double hotelPerPsgrTotalRate;
    @JsonProperty("hotelTotalBaseRate")
    private Double hotelTotalBaseRate;
    @JsonProperty("hotelTotalTaxesAndFees")
    private Double hotelTotalTaxesAndFees;
    @JsonProperty("hotelTotalRate")
    private Double hotelTotalRate;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("formattedTotalPriceValue")
    private String formattedTotalPriceValue;
    @JsonProperty("displayAveragePrice")
    private Boolean displayAveragePrice;
    @JsonProperty("drr")
    private Boolean drr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("hotelPerPsgrBaseRate")
    public Double getHotelPerPsgrBaseRate() {
        return hotelPerPsgrBaseRate;
    }

    @JsonProperty("hotelPerPsgrBaseRate")
    public void setHotelPerPsgrBaseRate(Double hotelPerPsgrBaseRate) {
        this.hotelPerPsgrBaseRate = hotelPerPsgrBaseRate;
    }

    @JsonProperty("hotelPerPsgrTaxesAndFees")
    public Double getHotelPerPsgrTaxesAndFees() {
        return hotelPerPsgrTaxesAndFees;
    }

    @JsonProperty("hotelPerPsgrTaxesAndFees")
    public void setHotelPerPsgrTaxesAndFees(Double hotelPerPsgrTaxesAndFees) {
        this.hotelPerPsgrTaxesAndFees = hotelPerPsgrTaxesAndFees;
    }

    @JsonProperty("hotelPerPsgrTotalRate")
    public Double getHotelPerPsgrTotalRate() {
        return hotelPerPsgrTotalRate;
    }

    @JsonProperty("hotelPerPsgrTotalRate")
    public void setHotelPerPsgrTotalRate(Double hotelPerPsgrTotalRate) {
        this.hotelPerPsgrTotalRate = hotelPerPsgrTotalRate;
    }

    @JsonProperty("hotelTotalBaseRate")
    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalBaseRate")
    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    @JsonProperty("hotelTotalRate")
    public Double getHotelTotalRate() {
        return hotelTotalRate;
    }

    @JsonProperty("hotelTotalRate")
    public void setHotelTotalRate(Double hotelTotalRate) {
        this.hotelTotalRate = hotelTotalRate;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("formattedTotalPriceValue")
    public String getFormattedTotalPriceValue() {
        return formattedTotalPriceValue;
    }

    @JsonProperty("formattedTotalPriceValue")
    public void setFormattedTotalPriceValue(String formattedTotalPriceValue) {
        this.formattedTotalPriceValue = formattedTotalPriceValue;
    }

    @JsonProperty("displayAveragePrice")
    public Boolean getDisplayAveragePrice() {
        return displayAveragePrice;
    }

    @JsonProperty("displayAveragePrice")
    public void setDisplayAveragePrice(Boolean displayAveragePrice) {
        this.displayAveragePrice = displayAveragePrice;
    }

    @JsonProperty("drr")
    public Boolean getDrr() {
        return drr;
    }

    @JsonProperty("drr")
    public void setDrr(Boolean drr) {
        this.drr = drr;
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
