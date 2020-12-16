package com.lizza.d02_factory.simple_factory;

/**
 *
 */
public class Product_C extends Product {

    public Product_C() {
        System.out.println("产品C");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
