
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
    "packageSearchUrl",
    "decodedPackageSearchUrl",
    "similarSearchLink",
    "flightDeeplinks",
    "hotelDeeplinks"
})

public class PackageUrls {

    @JsonProperty("packageSearchUrl")
    private String packageSearchUrl;
    @JsonProperty("decodedPackageSearchUrl")
    private String decodedPackageSearchUrl;
    @JsonProperty("similarSearchLink")
    private String similarSearchLink;
    @JsonProperty("flightDeeplinks")
    private FlightDeeplinks flightDeeplinks;
    @JsonProperty("hotelDeeplinks")
    private HotelDeeplinks hotelDeeplinks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("packageSearchUrl")
    public String getPackageSearchUrl() {
        return packageSearchUrl;
    }

    @JsonProperty("packageSearchUrl")
    public void setPackageSearchUrl(String packageSearchUrl) {
        this.packageSearchUrl = packageSearchUrl;
    }

    @JsonProperty("decodedPackageSearchUrl")
    public String getDecodedPackageSearchUrl() {
        return decodedPackageSearchUrl;
    }

    @JsonProperty("decodedPackageSearchUrl")
    public void setDecodedPackageSearchUrl(String decodedPackageSearchUrl) {
        this.decodedPackageSearchUrl = decodedPackageSearchUrl;
    }

    @JsonProperty("similarSearchLink")
    public String getSimilarSearchLink() {
        return similarSearchLink;
    }

    @JsonProperty("similarSearchLink")
    public void setSimilarSearchLink(String similarSearchLink) {
        this.similarSearchLink = similarSearchLink;
    }

    @JsonProperty("flightDeeplinks")
    public FlightDeeplinks getFlightDeeplinks() {
        return flightDeeplinks;
    }

    @JsonProperty("flightDeeplinks")
    public void setFlightDeeplinks(FlightDeeplinks flightDeeplinks) {
        this.flightDeeplinks = flightDeeplinks;
    }

    @JsonProperty("hotelDeeplinks")
    public HotelDeeplinks getHotelDeeplinks() {
        return hotelDeeplinks;
    }

    @JsonProperty("hotelDeeplinks")
    public void setHotelDeeplinks(HotelDeeplinks hotelDeeplinks) {
        this.hotelDeeplinks = hotelDeeplinks;
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
