package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorldWeatherRoot {
    @JsonProperty("data")
    private WorldWeather data;

    public WorldWeather getData() {
        return data;
    }

    public void setData(WorldWeather data) {
        this.data = data;
    }
}