package org.weather.service;

import org.weather.model.openweathermap.FiveDayForecastOWM;
import org.weather.model.openweathermap.ListObject;
import org.weather.model.openweathermap.OpenWeatherMap;
import org.weather.model.worldweather.Hourly;
import org.weather.model.worldweather.Weather;
import org.weather.model.worldweather.WorldWeather;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.apache.commons.lang.time.DateUtils;
import org.weather.model.worldweather.WorldWeatherRoot;

/**
* Created by Ivana on 1/13/2016.
*/
@Service("WeatherService")
public class WeatherService implements IWeatherService{

    //api key for world weather d22b92ea9de0aa7847feb6dfef5a9
    //api.worldweatheronline.com/free/v2/weather.ashx?q=Skopje&format=json&num_of_days=7&key=d22b92ea9de0aa7847feb6dfef5a9

    private static String OPENWEATHERMAP_URL = "http://api.openweathermap.org/data/2.5/weather?";
    private static String OPENWEATHERMAP_FORECAST_URL = "http://api.openweathermap.org/data/2.5/forecast?";
    private static String OPENWEATHERMAP_7DAYS_URL = "http://api.openweathermap.org/data/2.5/forecast/daily?";
    private static String OPENWEATHERMAP_APPID = "afa643658749f304e06f344cfa19fc7a";



    private static String WORLDWEATHER_URL = "http://api.worldweatheronline.com/free/v2/weather.ashx?";
    private static String WORLDWEATHER_APPID = "d22b92ea9de0aa7847feb6dfef5a9";

    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);


    // ---------------------OpenWeatherMap------------------------

    @Override
    public OpenWeatherMap dayForecastFromOWM(String location) {
        RestTemplate template = new RestTemplate();

        URI targetUrl = UriComponentsBuilder
                .fromUriString(OPENWEATHERMAP_URL)
                .queryParam("q", location).queryParam("appid", OPENWEATHERMAP_APPID).build().toUri();


        OpenWeatherMap todayForecast = template.getForObject(targetUrl, OpenWeatherMap.class);

        //path for image
        String iconCode = todayForecast.getWeathers().get(0).getIcon();
        String icon = "http://openweathermap.org/img/w/" + iconCode + ".png";
        todayForecast.getWeathers().get(0).setIcon(icon);

        //--------------conversion of the date-----------------------------------
        String today = todayForecast.getDate();
        long timeStamp = Long.parseLong(today);
        Date d = new Date(timeStamp * 1000);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date=format.format(d);
        //Date todaysDate = DateUtils.addHours(d, -1);
        System.out.println(date);
        todayForecast.setDate(date);

        //-----------------conversion to celsius------------------------------------
        double fTemp = todayForecast.getMainInfo().getTemperature();
        todayForecast.getMainInfo().setTemperature(fromFahrenheitToCelsius(fTemp));

        double fTempMin = todayForecast.getMainInfo().getTemp_min();
        todayForecast.getMainInfo().setTemp_min(fromFahrenheitToCelsius(fTempMin));

        double fTempMax = todayForecast.getMainInfo().getTemp_max();
        todayForecast.getMainInfo().setTemp_max(fromFahrenheitToCelsius(fTempMax));

        log.info(todayForecast.toString());

        return todayForecast;
    }

    private double fromFahrenheitToCelsius(double fahrenheit){
        double celsius = fahrenheit-273.15;//(fahrenheit-32)/1.8;
        return Math.round(celsius);
    }

//    @Override
//    public List<ListObject> weekForecastFromOWM(String location) {
//
//        RestTemplate template = new RestTemplate();
//
//        URI targetUrl = UriComponentsBuilder
//                .fromUriString(OPENWEATHERMAP_FORECAST_URL)
//                .queryParam("q", location).queryParam("appid", OPENWEATHERMAP_APPID).build().toUri();
//
//        List<ListObject> fiveDayForecast = template.getForObject(targetUrl, FiveDayForecastOWM.class).getListObjects();
//
//        long timeStamp = Long.parseLong("1453161600");
//        Date d = new Date(timeStamp * 1000);
//        Date newDate = DateUtils.addHours(d, -1);
//        System.out.println(d.toString());
//        System.out.println(newDate.toString());
//
//
////        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
////        Date today =null;
////        try {
////            today= sdf.parse(sdf.format(new Date()));
////            long milisec=today.getTime();
////            today.setTime(milisec + 43200000);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
////        System.out.println(today.toString());
//
//        return fiveDayForecast;
//    }


    @Override
    public FiveDayForecastOWM sevenDaysForecastFromOWM(String location){
        RestTemplate template = new RestTemplate();

        URI targetUrl = UriComponentsBuilder
                .fromUriString(OPENWEATHERMAP_7DAYS_URL)
                .queryParam("q", location).queryParam("appid", OPENWEATHERMAP_APPID).build().toUri();

        FiveDayForecastOWM sevenDayForecast = template.getForObject(targetUrl, FiveDayForecastOWM.class);



        for(int i=0; i<sevenDayForecast.getListObjects().size();i++) {

            //--------------conversion of the date-----------------------------------
            ListObject listObject = sevenDayForecast.getListObjects().get(i);
            String dd = listObject.getDate();
            long timeStamp = Long.parseLong(dd);
            Date d = new Date(timeStamp * 1000);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date = format.format(d);
            //Date todaysDate = DateUtils.addHours(d, -1);
            System.out.println(date);
            listObject.setDate(date);

            //path for image
            String iconCode = listObject.getWeather().get(0).getIcon();
            String icon = "http://openweathermap.org/img/w/" + iconCode + ".png";
            listObject.getWeather().get(0).setIcon(icon);

            //-----------------conversion to celsius------------------------------------
            double temp_day = listObject.getTemperatures().getTemp_day();
            listObject.getTemperatures().setTemp_day(fromFahrenheitToCelsius(temp_day));

            double temp_min = listObject.getTemperatures().getTemp_min();
            listObject.getTemperatures().setTemp_min(fromFahrenheitToCelsius(temp_min));

            double temp_max = listObject.getTemperatures().getTemp_max();
            listObject.getTemperatures().setTemp_max(fromFahrenheitToCelsius(temp_max));

            double temp_night = listObject.getTemperatures().getTemp_night();
            listObject.getTemperatures().setTemp_night(fromFahrenheitToCelsius(temp_night));

            double temp_eve = listObject.getTemperatures().getTemp_eve();
            listObject.getTemperatures().setTemp_eve(fromFahrenheitToCelsius(temp_eve));

            double temp_morn = listObject.getTemperatures().getTemp_morn();
            listObject.getTemperatures().setTemp_morn(fromFahrenheitToCelsius(temp_morn));
        }

        return sevenDayForecast;
    }

    // ---------------------WorldWeather------------------------

    @Override
    public WorldWeather dayForecastFromWW(String location) {

        RestTemplate template = new RestTemplate();

        URI targetUrl = UriComponentsBuilder
                .fromUriString(WORLDWEATHER_URL)
                .queryParam("q", location)
                .queryParam("format", "json")
                .queryParam("num_of_days", 1)
                .queryParam("date", "today")
                .queryParam("key", WORLDWEATHER_APPID).build().toUri();

        System.out.println(targetUrl);

        WorldWeather todayForecast = template.getForObject(targetUrl, WorldWeatherRoot.class).getData();

        String ci = todayForecast.getRequest().get(0).getQuery();
        String city = ci.split(",")[0];
        todayForecast.getRequest().get(0).setQuery(city.trim());

        ArrayList<Hourly> hourlies = (ArrayList<Hourly>) todayForecast.getWeather().get(0).getHourly();
        for(Hourly h:hourlies){
            h.setTime(returnHour(h.getTime()));
        }
        return todayForecast;
    }

    public String returnHour(String time){
        if(time.length()==3){
            return time.substring(0,1)+":"+time.substring(1);
        }
        else if(time.length()==4){
            return time.substring(0,2)+":"+time.substring(2);
        }
        return time;
    }

    @Override
    public WorldWeather weekForecastFromWW(String location) {

        RestTemplate template = new RestTemplate();

        URI targetUrl = UriComponentsBuilder
                .fromUriString(WORLDWEATHER_URL)
                .queryParam("q", location)
                .queryParam("format", "json")
                .queryParam("num_of_days", 5)
                .queryParam("key", WORLDWEATHER_APPID).build().toUri();

        System.out.println(targetUrl);

        WorldWeather worldWeather = template.getForObject(targetUrl, WorldWeatherRoot.class).getData();//.getWeather();

        //taking only the city from the value
        String ci = worldWeather.getRequest().get(0).getQuery();
        String city = ci.split(",")[0];
        worldWeather.getRequest().get(0).setQuery(city.trim());

        //converting the hour in the right form
        List<Weather> todayForecast = worldWeather.getWeather();
        for(int i=0; i<todayForecast.size(); i++) {
            ArrayList<Hourly> hourlies = (ArrayList<Hourly>) todayForecast.get(i).getHourly();
            for (Hourly h : hourlies) {
                h.setTime(returnHour(h.getTime()));
            }
        }
        return worldWeather;
    }




}
