package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    @JsonProperty("date")
    private String date;

    @JsonProperty("hourly")
    private List<Hourly> hourly;

    @JsonProperty("maxtempC")
    private int maxtempC;

    @JsonProperty("mintempC")
    private int mintempC;

    @JsonProperty("uvIndex")
    private double uvIndex;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Hourly> getHourly() {
        return hourly;
    }

    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }

    public int getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(int maxtempC) {
        this.maxtempC = maxtempC;
    }

    public int getMintempC() {
        return mintempC;
    }

    public void setMintempC(int mintempC) {
        this.mintempC = mintempC;
    }

    public double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }
}
