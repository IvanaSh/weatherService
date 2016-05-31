package org.weather.service;

import org.weather.model.openweathermap.FiveDayForecastOWM;
import org.weather.model.openweathermap.ListObject;
import org.weather.model.openweathermap.OpenWeatherMap;
import org.weather.model.worldweather.Weather;
import org.weather.model.worldweather.WorldWeather;
import org.weather.model.worldweather.WorldWeatherRoot;

import java.util.List;

/**
 * Created by Ivana on 1/13/2016.
 */
public interface IWeatherService {
    public OpenWeatherMap dayForecastFromOWM(String location);
//    public List<ListObject> weekForecastFromOWM(String location);
    public FiveDayForecastOWM sevenDaysForecastFromOWM(String location);
    public WorldWeather dayForecastFromWW(String location);
    public WorldWeather weekForecastFromWW(String location);
}
