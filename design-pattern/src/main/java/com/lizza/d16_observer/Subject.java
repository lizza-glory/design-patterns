package com.lizza.d16_observer;

/**
 * 被观察者
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
