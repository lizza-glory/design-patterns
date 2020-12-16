package com.lizza.d05_adapter.object_adapter;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args){
        Adapter adapter = new Adapter();
        int voltage = adapter.charge5();
        System.out.println("适配后的电压: " + voltage);
    }

}
