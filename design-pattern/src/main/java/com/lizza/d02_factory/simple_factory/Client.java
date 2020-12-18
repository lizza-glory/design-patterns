package com.lizza.d02_factory.simple_factory;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args){
        SimpleFactory factory = SimpleFactory.INSTANCE;
        Product product = factory.createProductByType("A");
        product.printName();
    }
}
