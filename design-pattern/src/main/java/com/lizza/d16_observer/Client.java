package com.lizza.d16_observer;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-14
 */
public class Client {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        weatherData.setData(12.0f, 23.2f, 25.4f);
        weatherData.registerObserver(new Baidu());
        weatherData.registerObserver(new Sina());
        weatherData.notifyObserver();
    }
}
