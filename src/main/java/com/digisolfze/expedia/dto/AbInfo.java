
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
    "displayDestinationAlternativeIsAvailable"
})

public class AbInfo {

    @JsonProperty("displayDestinationAlternativeIsAvailable")
    private String displayDestinationAlternativeIsAvailable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("displayDestinationAlternativeIsAvailable")
    public String getDisplayDestinationAlternativeIsAvailable() {
        return displayDestinationAlternativeIsAvailable;
    }

    @JsonProperty("displayDestinationAlternativeIsAvailable")
    public void setDisplayDestinationAlternativeIsAvailable(String displayDestinationAlternativeIsAvailable) {
        this.displayDestinationAlternativeIsAvailable = displayDestinationAlternativeIsAvailable;
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
