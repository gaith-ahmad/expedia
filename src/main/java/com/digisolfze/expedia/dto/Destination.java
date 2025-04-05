
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
    "regionID",
    "longName",
    "continent",
    "country",
    "province",
    "city",
    "displayDestination",
    "flightDestination",
    "displayDestinationRegionId",
    "tla",
    "metrocode",
    "pointOfSaleRank"
})

public class Destination {

    @JsonProperty("regionID")
    private String regionID;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("displayDestination")
    private String displayDestination;
    @JsonProperty("flightDestination")
    private String flightDestination;
    @JsonProperty("displayDestinationRegionId")
    private String displayDestinationRegionId;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("metrocode")
    private String metrocode;
    @JsonProperty("pointOfSaleRank")
    private Integer pointOfSaleRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("regionID")
    public String getRegionID() {
        return regionID;
    }

    @JsonProperty("regionID")
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("displayDestination")
    public String getDisplayDestination() {
        return displayDestination;
    }

    @JsonProperty("displayDestination")
    public void setDisplayDestination(String displayDestination) {
        this.displayDestination = displayDestination;
    }

    @JsonProperty("flightDestination")
    public String getFlightDestination() {
        return flightDestination;
    }

    @JsonProperty("flightDestination")
    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    @JsonProperty("displayDestinationRegionId")
    public String getDisplayDestinationRegionId() {
        return displayDestinationRegionId;
    }

    @JsonProperty("displayDestinationRegionId")
    public void setDisplayDestinationRegionId(String displayDestinationRegionId) {
        this.displayDestinationRegionId = displayDestinationRegionId;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    @JsonProperty("metrocode")
    public String getMetrocode() {
        return metrocode;
    }

    @JsonProperty("metrocode")
    public void setMetrocode(String metrocode) {
        this.metrocode = metrocode;
    }

    @JsonProperty("pointOfSaleRank")
    public Integer getPointOfSaleRank() {
        return pointOfSaleRank;
    }

    @JsonProperty("pointOfSaleRank")
    public void setPointOfSaleRank(Integer pointOfSaleRank) {
        this.pointOfSaleRank = pointOfSaleRank;
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
