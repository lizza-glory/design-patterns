package com.lizza.d16_observer;

/**
 * 观察者
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
