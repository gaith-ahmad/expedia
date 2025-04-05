
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
    "flightSearchUrl",
    "decodedFlightSearchUrl"
})

public class FlightDeeplinks {

    @JsonProperty("flightSearchUrl")
    private String flightSearchUrl;
    @JsonProperty("decodedFlightSearchUrl")
    private String decodedFlightSearchUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("flightSearchUrl")
    public String getFlightSearchUrl() {
        return flightSearchUrl;
    }

    @JsonProperty("flightSearchUrl")
    public void setFlightSearchUrl(String flightSearchUrl) {
        this.flightSearchUrl = flightSearchUrl;
    }

    @JsonProperty("decodedFlightSearchUrl")
    public String getDecodedFlightSearchUrl() {
        return decodedFlightSearchUrl;
    }

    @JsonProperty("decodedFlightSearchUrl")
    public void setDecodedFlightSearchUrl(String decodedFlightSearchUrl) {
        this.decodedFlightSearchUrl = decodedFlightSearchUrl;
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
