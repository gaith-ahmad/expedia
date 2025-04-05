
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
    "hotelInfositeUrl",
    "hotelSearchResultUrl",
    "pinnedHotelSearchResultUrl",
    "decodedHotelInfositeUrl",
    "decodedHotelSearchResultUrl",
    "decodedHsrSortByVrUrl",
    "decodedPinnedHsrSortByRecommendedUrl",
    "decodedPinnedHsrSortByBestUrl",
    "decodedPinnedHsrSortByModUrl",
    "decodedPinnedHsrSortByVrUrl",
    "similarSearchLink"
})

public class HotelDeeplinks {

    @JsonProperty("hotelInfositeUrl")
    private String hotelInfositeUrl;
    @JsonProperty("hotelSearchResultUrl")
    private String hotelSearchResultUrl;
    @JsonProperty("pinnedHotelSearchResultUrl")
    private String pinnedHotelSearchResultUrl;
    @JsonProperty("decodedHotelInfositeUrl")
    private String decodedHotelInfositeUrl;
    @JsonProperty("decodedHotelSearchResultUrl")
    private String decodedHotelSearchResultUrl;
    @JsonProperty("decodedHsrSortByVrUrl")
    private String decodedHsrSortByVrUrl;
    @JsonProperty("decodedPinnedHsrSortByRecommendedUrl")
    private String decodedPinnedHsrSortByRecommendedUrl;
    @JsonProperty("decodedPinnedHsrSortByBestUrl")
    private String decodedPinnedHsrSortByBestUrl;
    @JsonProperty("decodedPinnedHsrSortByModUrl")
    private String decodedPinnedHsrSortByModUrl;
    @JsonProperty("decodedPinnedHsrSortByVrUrl")
    private String decodedPinnedHsrSortByVrUrl;
    @JsonProperty("similarSearchLink")
    private String similarSearchLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("hotelInfositeUrl")
    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    @JsonProperty("hotelInfositeUrl")
    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    @JsonProperty("pinnedHotelSearchResultUrl")
    public String getPinnedHotelSearchResultUrl() {
        return pinnedHotelSearchResultUrl;
    }

    @JsonProperty("pinnedHotelSearchResultUrl")
    public void setPinnedHotelSearchResultUrl(String pinnedHotelSearchResultUrl) {
        this.pinnedHotelSearchResultUrl = pinnedHotelSearchResultUrl;
    }

    @JsonProperty("decodedHotelInfositeUrl")
    public String getDecodedHotelInfositeUrl() {
        return decodedHotelInfositeUrl;
    }

    @JsonProperty("decodedHotelInfositeUrl")
    public void setDecodedHotelInfositeUrl(String decodedHotelInfositeUrl) {
        this.decodedHotelInfositeUrl = decodedHotelInfositeUrl;
    }

    @JsonProperty("decodedHotelSearchResultUrl")
    public String getDecodedHotelSearchResultUrl() {
        return decodedHotelSearchResultUrl;
    }

    @JsonProperty("decodedHotelSearchResultUrl")
    public void setDecodedHotelSearchResultUrl(String decodedHotelSearchResultUrl) {
        this.decodedHotelSearchResultUrl = decodedHotelSearchResultUrl;
    }

    @JsonProperty("decodedHsrSortByVrUrl")
    public String getDecodedHsrSortByVrUrl() {
        return decodedHsrSortByVrUrl;
    }

    @JsonProperty("decodedHsrSortByVrUrl")
    public void setDecodedHsrSortByVrUrl(String decodedHsrSortByVrUrl) {
        this.decodedHsrSortByVrUrl = decodedHsrSortByVrUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByRecommendedUrl")
    public String getDecodedPinnedHsrSortByRecommendedUrl() {
        return decodedPinnedHsrSortByRecommendedUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByRecommendedUrl")
    public void setDecodedPinnedHsrSortByRecommendedUrl(String decodedPinnedHsrSortByRecommendedUrl) {
        this.decodedPinnedHsrSortByRecommendedUrl = decodedPinnedHsrSortByRecommendedUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByBestUrl")
    public String getDecodedPinnedHsrSortByBestUrl() {
        return decodedPinnedHsrSortByBestUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByBestUrl")
    public void setDecodedPinnedHsrSortByBestUrl(String decodedPinnedHsrSortByBestUrl) {
        this.decodedPinnedHsrSortByBestUrl = decodedPinnedHsrSortByBestUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByModUrl")
    public String getDecodedPinnedHsrSortByModUrl() {
        return decodedPinnedHsrSortByModUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByModUrl")
    public void setDecodedPinnedHsrSortByModUrl(String decodedPinnedHsrSortByModUrl) {
        this.decodedPinnedHsrSortByModUrl = decodedPinnedHsrSortByModUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByVrUrl")
    public String getDecodedPinnedHsrSortByVrUrl() {
        return decodedPinnedHsrSortByVrUrl;
    }

    @JsonProperty("decodedPinnedHsrSortByVrUrl")
    public void setDecodedPinnedHsrSortByVrUrl(String decodedPinnedHsrSortByVrUrl) {
        this.decodedPinnedHsrSortByVrUrl = decodedPinnedHsrSortByVrUrl;
    }

    @JsonProperty("similarSearchLink")
    public String getSimilarSearchLink() {
        return similarSearchLink;
    }

    @JsonProperty("similarSearchLink")
    public void setSimilarSearchLink(String similarSearchLink) {
        this.similarSearchLink = similarSearchLink;
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
