package com.lizza.d16_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> list;

    public WeatherData() {
        list = new ArrayList<>();
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        list.forEach(e -> {
            e.update(temperature, humidity, pressure);
        });
    }
}
