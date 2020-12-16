package com.lizza.d16_observer;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-14
 */
public class Baidu implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("========百度天气========");
        System.out.println("温度: " + this.temperature);
        System.out.println("湿度: " + this.humidity);
        System.out.println("气压: " + this.pressure);
    }
}
