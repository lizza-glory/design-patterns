package com.lizza.d02_factory.factory_method;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class Client {

    public static void main(String[] args){
        Factory factory = new FactoryA();
        Product product = factory.create();
        product.info();
    }
}
