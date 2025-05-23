
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
    "hotelId",
    "hotelName",
    "localizedHotelName",
    "hotelDestination",
    "hotelDestinationRegionID",
    "hotelLongDestination",
    "hotelStreetAddress",
    "hotelCity",
    "hotelProvince",
    "hotelCountryCode",
    "hotelLatitude",
    "hotelLongitude",
    "hotelStarRating",
    "hotelGuestReviewRating",
    "formattedHotelGuestReviewRating",
    "hotelReviewTotal",
    "formattedHotelReviewTotal",
    "hotelImageUrl",
    "bigHotelImageUrl",
    "vipIconUrl",
    "vipAccess",
    "enhancedCleaningAvailable",
    "isOfficialRating"
})

public class HotelInfo {

    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("localizedHotelName")
    private String localizedHotelName;
    @JsonProperty("hotelDestination")
    private String hotelDestination;
    @JsonProperty("hotelDestinationRegionID")
    private String hotelDestinationRegionID;
    @JsonProperty("hotelLongDestination")
    private String hotelLongDestination;
    @JsonProperty("hotelStreetAddress")
    private String hotelStreetAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelProvince")
    private String hotelProvince;
    @JsonProperty("hotelCountryCode")
    private String hotelCountryCode;
    @JsonProperty("hotelLatitude")
    private Double hotelLatitude;
    @JsonProperty("hotelLongitude")
    private Double hotelLongitude;
    @JsonProperty("hotelStarRating")
    private String hotelStarRating;
    @JsonProperty("hotelGuestReviewRating")
    private Double hotelGuestReviewRating;
    @JsonProperty("formattedHotelGuestReviewRating")
    private String formattedHotelGuestReviewRating;
    @JsonProperty("hotelReviewTotal")
    private Integer hotelReviewTotal;
    @JsonProperty("formattedHotelReviewTotal")
    private String formattedHotelReviewTotal;
    @JsonProperty("hotelImageUrl")
    private String hotelImageUrl;
    @JsonProperty("bigHotelImageUrl")
    private String bigHotelImageUrl;
    @JsonProperty("vipIconUrl")
    private String vipIconUrl;
    @JsonProperty("vipAccess")
    private Boolean vipAccess;
    @JsonProperty("enhancedCleaningAvailable")
    private Boolean enhancedCleaningAvailable;
    @JsonProperty("isOfficialRating")
    private Boolean isOfficialRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("hotelId")
    public String getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotelId")
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @JsonProperty("hotelName")
    public String getHotelName() {
        return hotelName;
    }

    @JsonProperty("hotelName")
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @JsonProperty("localizedHotelName")
    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    @JsonProperty("localizedHotelName")
    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    @JsonProperty("hotelDestination")
    public String getHotelDestination() {
        return hotelDestination;
    }

    @JsonProperty("hotelDestination")
    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    @JsonProperty("hotelDestinationRegionID")
    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    @JsonProperty("hotelDestinationRegionID")
    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    @JsonProperty("hotelLongDestination")
    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    @JsonProperty("hotelLongDestination")
    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    @JsonProperty("hotelStreetAddress")
    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    @JsonProperty("hotelStreetAddress")
    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    @JsonProperty("hotelCity")
    public String getHotelCity() {
        return hotelCity;
    }

    @JsonProperty("hotelCity")
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    @JsonProperty("hotelProvince")
    public String getHotelProvince() {
        return hotelProvince;
    }

    @JsonProperty("hotelProvince")
    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    @JsonProperty("hotelCountryCode")
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    @JsonProperty("hotelCountryCode")
    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    @JsonProperty("hotelLatitude")
    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    @JsonProperty("hotelLatitude")
    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    @JsonProperty("hotelLongitude")
    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    @JsonProperty("hotelLongitude")
    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    @JsonProperty("hotelStarRating")
    public String getHotelStarRating() {
        return hotelStarRating;
    }

    @JsonProperty("hotelStarRating")
    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    @JsonProperty("hotelGuestReviewRating")
    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    @JsonProperty("hotelGuestReviewRating")
    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    @JsonProperty("formattedHotelGuestReviewRating")
    public String getFormattedHotelGuestReviewRating() {
        return formattedHotelGuestReviewRating;
    }

    @JsonProperty("formattedHotelGuestReviewRating")
    public void setFormattedHotelGuestReviewRating(String formattedHotelGuestReviewRating) {
        this.formattedHotelGuestReviewRating = formattedHotelGuestReviewRating;
    }

    @JsonProperty("hotelReviewTotal")
    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    @JsonProperty("hotelReviewTotal")
    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    @JsonProperty("formattedHotelReviewTotal")
    public String getFormattedHotelReviewTotal() {
        return formattedHotelReviewTotal;
    }

    @JsonProperty("formattedHotelReviewTotal")
    public void setFormattedHotelReviewTotal(String formattedHotelReviewTotal) {
        this.formattedHotelReviewTotal = formattedHotelReviewTotal;
    }

    @JsonProperty("hotelImageUrl")
    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    @JsonProperty("hotelImageUrl")
    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    @JsonProperty("bigHotelImageUrl")
    public String getBigHotelImageUrl() {
        return bigHotelImageUrl;
    }

    @JsonProperty("bigHotelImageUrl")
    public void setBigHotelImageUrl(String bigHotelImageUrl) {
        this.bigHotelImageUrl = bigHotelImageUrl;
    }

    @JsonProperty("vipIconUrl")
    public String getVipIconUrl() {
        return vipIconUrl;
    }

    @JsonProperty("vipIconUrl")
    public void setVipIconUrl(String vipIconUrl) {
        this.vipIconUrl = vipIconUrl;
    }

    @JsonProperty("vipAccess")
    public Boolean getVipAccess() {
        return vipAccess;
    }

    @JsonProperty("vipAccess")
    public void setVipAccess(Boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    @JsonProperty("enhancedCleaningAvailable")
    public Boolean getEnhancedCleaningAvailable() {
        return enhancedCleaningAvailable;
    }

    @JsonProperty("enhancedCleaningAvailable")
    public void setEnhancedCleaningAvailable(Boolean enhancedCleaningAvailable) {
        this.enhancedCleaningAvailable = enhancedCleaningAvailable;
    }

    @JsonProperty("isOfficialRating")
    public Boolean getIsOfficialRating() {
        return isOfficialRating;
    }

    @JsonProperty("isOfficialRating")
    public void setIsOfficialRating(Boolean isOfficialRating) {
        this.isOfficialRating = isOfficialRating;
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
