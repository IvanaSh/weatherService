package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherIconUrl {
    @JsonProperty("value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
