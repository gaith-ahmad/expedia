
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
    "offerInfo",
    "userInfo",
    "debugInfo",
    "abInfo",
    "pricingSummaries",
    "offers"
})

public class Expedia {

    @JsonProperty("offerInfo")
    private OfferInfo offerInfo;
    @JsonProperty("userInfo")
    private UserInfo userInfo;
    @JsonProperty("debugInfo")
    private DebugInfo debugInfo;
    @JsonProperty("abInfo")
    private AbInfo abInfo;
    @JsonProperty("pricingSummaries")
    private PricingSummaries pricingSummaries;
    @JsonProperty("offers")
    private Offers offers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("offerInfo")
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    @JsonProperty("offerInfo")
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    @JsonProperty("userInfo")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @JsonProperty("debugInfo")
    public DebugInfo getDebugInfo() {
        return debugInfo;
    }

    @JsonProperty("debugInfo")
    public void setDebugInfo(DebugInfo debugInfo) {
        this.debugInfo = debugInfo;
    }

    @JsonProperty("abInfo")
    public AbInfo getAbInfo() {
        return abInfo;
    }

    @JsonProperty("abInfo")
    public void setAbInfo(AbInfo abInfo) {
        this.abInfo = abInfo;
    }

    @JsonProperty("pricingSummaries")
    public PricingSummaries getPricingSummaries() {
        return pricingSummaries;
    }

    @JsonProperty("pricingSummaries")
    public void setPricingSummaries(PricingSummaries pricingSummaries) {
        this.pricingSummaries = pricingSummaries;
    }

    @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Offers offers) {
        this.offers = offers;
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
