
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
    "offerDateRange",
    "destination",
    "displayDestinationAlternativeIsAvailable",
    "hotelInfo",
    "hotelPricingInfo",
    "flightInfo",
    "flightPricingInfo",
    "packageInfo",
    "packagePricingInfo",
    "packageUrls",
    "origin"
})

public class Package {

    @JsonProperty("offerDateRange")
    private OfferDateRange offerDateRange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("displayDestinationAlternativeIsAvailable")
    private Boolean displayDestinationAlternativeIsAvailable;
    @JsonProperty("hotelInfo")
    private HotelInfo hotelInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfo hotelPricingInfo;
    @JsonProperty("flightInfo")
    private FlightInfo flightInfo;
    @JsonProperty("flightPricingInfo")
    private FlightPricingInfo flightPricingInfo;
    @JsonProperty("packageInfo")
    private PackageInfo packageInfo;
    @JsonProperty("packagePricingInfo")
    private PackagePricingInfo packagePricingInfo;
    @JsonProperty("packageUrls")
    private PackageUrls packageUrls;
    @JsonProperty("origin")
    private Origin origin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("offerDateRange")
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    @JsonProperty("offerDateRange")
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("displayDestinationAlternativeIsAvailable")
    public Boolean getDisplayDestinationAlternativeIsAvailable() {
        return displayDestinationAlternativeIsAvailable;
    }

    @JsonProperty("displayDestinationAlternativeIsAvailable")
    public void setDisplayDestinationAlternativeIsAvailable(Boolean displayDestinationAlternativeIsAvailable) {
        this.displayDestinationAlternativeIsAvailable = displayDestinationAlternativeIsAvailable;
    }

    @JsonProperty("hotelInfo")
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    @JsonProperty("hotelInfo")
    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    @JsonProperty("flightInfo")
    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    @JsonProperty("flightInfo")
    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    @JsonProperty("flightPricingInfo")
    public FlightPricingInfo getFlightPricingInfo() {
        return flightPricingInfo;
    }

    @JsonProperty("flightPricingInfo")
    public void setFlightPricingInfo(FlightPricingInfo flightPricingInfo) {
        this.flightPricingInfo = flightPricingInfo;
    }

    @JsonProperty("packageInfo")
    public PackageInfo getPackageInfo() {
        return packageInfo;
    }

    @JsonProperty("packageInfo")
    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfo = packageInfo;
    }

    @JsonProperty("packagePricingInfo")
    public PackagePricingInfo getPackagePricingInfo() {
        return packagePricingInfo;
    }

    @JsonProperty("packagePricingInfo")
    public void setPackagePricingInfo(PackagePricingInfo packagePricingInfo) {
        this.packagePricingInfo = packagePricingInfo;
    }

    @JsonProperty("packageUrls")
    public PackageUrls getPackageUrls() {
        return packageUrls;
    }

    @JsonProperty("packageUrls")
    public void setPackageUrls(PackageUrls packageUrls) {
        this.packageUrls = packageUrls;
    }

    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
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
