package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    double average;


        public double averageTemperature() {
            Map<String, Double> resultMap = new HashMap<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();

        }
            average = average / 5;
        return average;
    }
int i=0;
    public double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            i++;
        }
    double median = 0;

        if(i%2==1)
            {
                median = (i/2)-1;

            }
            else
            {
                median = ((i/2)-1 + (i/2))/2;

            }


            return median;
    }



}