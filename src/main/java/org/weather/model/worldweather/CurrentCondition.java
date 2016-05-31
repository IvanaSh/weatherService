package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentCondition {
    @JsonProperty("FeelsLikeC")
    private int feelsLikeC;

    @JsonProperty("humidity")
    private double humidity;

    @JsonProperty("observation_time")
    private String observation_time;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("temp_C")
    private int temp_C;

    @JsonProperty("weatherDesc")
    private List<WeatherDesc> weatherDesc;

    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> weatherIconUrl;

    @JsonProperty("winddir16Point")
    private String winddir16Point;

    @JsonProperty("windspeedKmph")
    private double windspeedKmph;

    public int getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(int feelsLikeC) {
        feelsLikeC = feelsLikeC;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getObservation_time() {
        return observation_time;
    }

    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getTemp_C() {
        return temp_C;
    }

    public void setTemp_C(int temp_C) {
        this.temp_C = temp_C;
    }

    public List<WeatherDesc> getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public List<WeatherIconUrl> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public String getWinddir16Point() {
        return winddir16Point;
    }

    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    public double getWindspeedKmph() {
        return windspeedKmph;
    }

    public void setWindspeedKmph(double windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }
}
