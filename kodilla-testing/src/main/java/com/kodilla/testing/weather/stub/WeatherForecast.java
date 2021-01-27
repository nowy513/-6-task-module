package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
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

    int i = 0;
        public double averageTemperature() {
            Map<String, Double> resultMap = new HashMap<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();

        }
            average = average / temperatures.getTemperatures().size();
        return average;
    }

    public double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        ArrayList<Double> medianList = new ArrayList<>();
        i = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            medianList.add(temperature.getValue());
        }

        Collections.sort(medianList);

    int median = 0;

        if(medianList.size()%2==1)
            {
                medianIndex = (medianList.size()+1)/2-1;
            }
            else
            {
                 return  (medianList.get(medianList.size()/2-1)+medianList.get(medianList.size()/2))/2;
            }
        return medianList.get(medianIndex);
    }



}