package org.weather.model.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind{
    @JsonProperty("speed")
    private Float windSpeed;
    @JsonProperty("deg")
    private Float degree;

    public Wind(){}

    public Wind(Float windSpeed, Float degree) {
        this.windSpeed = windSpeed;
        this.degree = degree;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getDegree() {
        return degree;
    }

    public void setDegree(Float degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "windSpeed=" + windSpeed +
                ", degree=" + degree +
                '}';
    }
}