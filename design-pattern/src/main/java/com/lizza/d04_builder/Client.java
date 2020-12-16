package com.lizza.d04_builder;

/**
 * 客户端要素
 * 1. 建造者
 * 2. 产品
 */
public class Client {

    public static void main(String[] args){
        Builder builder = new CommonBuilder();
        Director director = new Director(builder);
        House house = director.build();
        System.out.println(house);
    }
}
