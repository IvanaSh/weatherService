package org.weather.model.worldweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ivana on 1/19/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
    @JsonProperty("query")
    private String query;

    @JsonProperty("type")
    private String type;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
