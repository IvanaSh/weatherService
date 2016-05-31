package org.weather.model.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by Ivana on 1/17/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMap {

    @JsonProperty("coord")
    private Coordinates coordinates;

    @JsonProperty("weather")
    private List<Weather> weathers;

    @JsonProperty("main")
    private MainInfo mainInfo;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("dt")
    private String date;

    @JsonProperty("name")
    private String city;

    public OpenWeatherMap() {
    }

    public OpenWeatherMap(Coordinates coordinates, List<Weather> weathers, MainInfo mainInfo, Wind wind, String date, String city) {
        this.coordinates = coordinates;
        this.weathers = weathers;
        this.mainInfo = mainInfo;
        this.wind = wind;
        this.date = date;
        this.city = city;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }

    public MainInfo getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "OpenWeatherMap{" +
                "coordinates=" + coordinates +
                ", weathers=" + weathers +
                ", mainInfo=" + mainInfo +
                ", wind=" + wind +
                ", date=" + date +
                ", city='" + city + '\'' +
                '}';
    }
}



