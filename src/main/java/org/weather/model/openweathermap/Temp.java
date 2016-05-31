package org.weather.model.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ivana on 1/24/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temp {

    @JsonProperty("day")
    private double temp_day;

    @JsonProperty("min")
    private double temp_min;

    @JsonProperty("max")
    private double temp_max;

    @JsonProperty("night")
    private double temp_night;

    @JsonProperty("eve")
    private double temp_eve;

    @JsonProperty("morn")
    private double temp_morn;

    public Temp() {
    }

    public double getTemp_day() {
        return temp_day;
    }

    public void setTemp_day(double temp_day) {
        this.temp_day = temp_day;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_night() {
        return temp_night;
    }

    public void setTemp_night(double temp_night) {
        this.temp_night = temp_night;
    }

    public double getTemp_eve() {
        return temp_eve;
    }

    public void setTemp_eve(double temp_eve) {
        this.temp_eve = temp_eve;
    }

    public double getTemp_morn() {
        return temp_morn;
    }

    public void setTemp_morn(double temp_morn) {
        this.temp_morn = temp_morn;
    }
}
