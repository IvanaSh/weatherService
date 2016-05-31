package org.weather.model.openweathermap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Ivana on 1/18/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FiveDayForecastOWM {
    @JsonProperty("city")
    private City city;

    @JsonProperty("list")
    private List<ListObject> listObjects;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<ListObject> getListObjects() {
        return listObjects;
    }

    public void setListObjects(List<ListObject> listObjects) {
        this.listObjects = listObjects;
    }
}



