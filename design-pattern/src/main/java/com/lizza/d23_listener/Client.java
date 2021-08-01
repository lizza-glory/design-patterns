package com.lizza.d23_listener;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-08-01
 */
public class Client {

    public static void main(String[] args){
        PrintService printService = new PrintService();
        Listener listener = new Listener();
        printService.registerListener(listener);
        printService.print();
    }
}
