package com.lizza.d06_bridge;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public class Phone implements ISender {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println("[Phone] From: " + from + ", To: " + to);
        System.out.println("\tMsg: " + msg);
    }
}
