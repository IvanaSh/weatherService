package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hourly {
    @JsonProperty("tempC")
    private int tempC;

    @JsonProperty("FeelsLikeC")
    private int feelsLikeC;

    @JsonProperty("humidity")
    private double humidity;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("visibility")
    private double visibility;

    @JsonProperty("time")
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("weatherDesc")
    private List<WeatherDesc> weatherDesc;

    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> weatherIconUrl;

    @JsonProperty("WindChillC")
    private int windChillC;

    @JsonProperty("winddir16Point")
    private String winddir16Point;

    @JsonProperty("windspeedKmph")
    private int windspeedKmph;

    @JsonProperty("chanceoffog")
    private int chanceoffog;

    @JsonProperty("chanceoffrost")
    private int chanceoffrost;

    @JsonProperty("chanceofhightemp")
    private int chanceofhightemp;

    @JsonProperty("chanceofthunder")
    private int chanceofthunder;

    @JsonProperty("chanceofrain")
    private int chanceofrain;

    @JsonProperty("chanceofsnow")
    private int chanceofsnow;

    @JsonProperty("chanceofsunshine")
    private int chanceofsunshine;

    @JsonProperty("chanceofwindy")
    private int chanceofwindy;

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public int getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(int feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
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

    public int getWindChillC() {
        return windChillC;
    }

    public void setWindChillC(int windChillC) {
        this.windChillC = windChillC;
    }

    public String getWinddir16Point() {
        return winddir16Point;
    }

    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    public int getWindspeedKmph() {
        return windspeedKmph;
    }

    public void setWindspeedKmph(int windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    public int getChanceoffrost() {
        return chanceoffrost;
    }

    public void setChanceoffrost(int chanceoffrost) {
        this.chanceoffrost = chanceoffrost;
    }

    public int getChanceofhightemp() {
        return chanceofhightemp;
    }

    public void setChanceofhightemp(int chanceofhightemp) {
        this.chanceofhightemp = chanceofhightemp;
    }

    public int getChanceofthunder() {
        return chanceofthunder;
    }

    public void setChanceofthunder(int chanceofthunder) {
        this.chanceofthunder = chanceofthunder;
    }

    public int getChanceofrain() {
        return chanceofrain;
    }

    public void setChanceofrain(int chanceofrain) {
        this.chanceofrain = chanceofrain;
    }

    public int getChanceofsnow() {
        return chanceofsnow;
    }

    public void setChanceofsnow(int chanceofsnow) {
        this.chanceofsnow = chanceofsnow;
    }

    public int getChanceofsunshine() {
        return chanceofsunshine;
    }

    public void setChanceofsunshine(int chanceofsunshine) {
        this.chanceofsunshine = chanceofsunshine;
    }

    public int getChanceofwindy() {
        return chanceofwindy;
    }

    public void setChanceofwindy(int chanceofwindy) {
        this.chanceofwindy = chanceofwindy;
    }

    public int getChanceoffog() {
        return chanceoffog;
    }

    public void setChanceoffog(int chanceoffog) {
        this.chanceoffog = chanceoffog;
    }
}
