
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
    "flightDealCarrier",
    "flightDealCarrierName",
    "lengthOfStay",
    "flightDealCarrierImageUrl",
    "flightDealCarrierImageUrlSqSvg",
    "tripType"
})

public class FlightInfo {

    @JsonProperty("flightDealCarrier")
    private String flightDealCarrier;
    @JsonProperty("flightDealCarrierName")
    private String flightDealCarrierName;
    @JsonProperty("lengthOfStay")
    private Integer lengthOfStay;
    @JsonProperty("flightDealCarrierImageUrl")
    private String flightDealCarrierImageUrl;
    @JsonProperty("flightDealCarrierImageUrlSqSvg")
    private String flightDealCarrierImageUrlSqSvg;
    @JsonProperty("tripType")
    private String tripType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("flightDealCarrier")
    public String getFlightDealCarrier() {
        return flightDealCarrier;
    }

    @JsonProperty("flightDealCarrier")
    public void setFlightDealCarrier(String flightDealCarrier) {
        this.flightDealCarrier = flightDealCarrier;
    }

    @JsonProperty("flightDealCarrierName")
    public String getFlightDealCarrierName() {
        return flightDealCarrierName;
    }

    @JsonProperty("flightDealCarrierName")
    public void setFlightDealCarrierName(String flightDealCarrierName) {
        this.flightDealCarrierName = flightDealCarrierName;
    }

    @JsonProperty("lengthOfStay")
    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    @JsonProperty("lengthOfStay")
    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    @JsonProperty("flightDealCarrierImageUrl")
    public String getFlightDealCarrierImageUrl() {
        return flightDealCarrierImageUrl;
    }

    @JsonProperty("flightDealCarrierImageUrl")
    public void setFlightDealCarrierImageUrl(String flightDealCarrierImageUrl) {
        this.flightDealCarrierImageUrl = flightDealCarrierImageUrl;
    }

    @JsonProperty("flightDealCarrierImageUrlSqSvg")
    public String getFlightDealCarrierImageUrlSqSvg() {
        return flightDealCarrierImageUrlSqSvg;
    }

    @JsonProperty("flightDealCarrierImageUrlSqSvg")
    public void setFlightDealCarrierImageUrlSqSvg(String flightDealCarrierImageUrlSqSvg) {
        this.flightDealCarrierImageUrlSqSvg = flightDealCarrierImageUrlSqSvg;
    }

    @JsonProperty("tripType")
    public String getTripType() {
        return tripType;
    }

    @JsonProperty("tripType")
    public void setTripType(String tripType) {
        this.tripType = tripType;
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
