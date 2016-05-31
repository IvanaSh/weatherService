package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.weather.model.openweathermap.Weather;

import java.util.List;

/**
 * Created by Ivana on 1/17/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorldWeather {
    @JsonProperty("current_condition")
    private List<CurrentCondition> current_condition;

    @JsonProperty("request")
    private List<Request> request;

    @JsonProperty("weather")
    private List<org.weather.model.worldweather.Weather> weather;

    public List<CurrentCondition> getCurrent_condition() {
        return current_condition;
    }

    public void setCurrent_condition(List<CurrentCondition> current_condition) {
        this.current_condition = current_condition;
    }

    public List<Request> getRequest() {
        return request;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    public List<org.weather.model.worldweather.Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<org.weather.model.worldweather.Weather> weather) {
        this.weather = weather;
    }
}
