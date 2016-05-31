package org.weather.controller;

import org.weather.model.openweathermap.FiveDayForecastOWM;
import org.weather.model.openweathermap.ListObject;
import org.weather.model.openweathermap.OpenWeatherMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.weather.model.worldweather.Weather;
import org.weather.model.worldweather.WorldWeather;
import org.weather.model.worldweather.WorldWeatherRoot;
import org.weather.service.IWeatherService;

import java.util.List;

/**
* Created by Ivana on 1/17/2016.
*/
@RestController
public class WeatherController implements ErrorController{

    @Autowired
    @Qualifier("WeatherService")
    private IWeatherService weatherService;
    private static final String PATH = "/error";

    @RequestMapping("/dayForecastFromOWM")
    public OpenWeatherMap dayForecastFromOWM(
            @RequestParam(value = "loc", defaultValue="Skopje", required = true) String location) {
        return weatherService.dayForecastFromOWM(location);
    }

//    @RequestMapping("/weekForecastFromOWM")
//    public List<ListObject> weekForecastFromOWM(
//            @RequestParam(value = "loc", defaultValue="Skopje", required = true) String location) {
//        return weatherService.weekForecastFromOWM(location);
//    }

    @RequestMapping("/sevenDaysForecastFromOWM")
    public FiveDayForecastOWM sevenDaysForecastFromOWM(
            @RequestParam(value = "loc", defaultValue="Skopje", required = true) String location) {
        return weatherService.sevenDaysForecastFromOWM(location);
    }

    @RequestMapping("/dayForecastFromWW")
    public WorldWeather dayForecastFromWW(
            @RequestParam(value = "loc", defaultValue="Skopje", required = true) String location) {
        return weatherService.dayForecastFromWW(location);
    }

    @RequestMapping("/weekForecastFromWW")
    public WorldWeather weekForecastFromWW(
            @RequestParam(value = "loc", defaultValue="Skopje", required = true) String location) {
        return weatherService.weekForecastFromWW(location);
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
