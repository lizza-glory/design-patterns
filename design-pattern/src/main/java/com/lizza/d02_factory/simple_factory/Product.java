package com.lizza.d02_factory.simple_factory;

/**
 * 抽象产品类
 */
public abstract class Product {

    protected String name;

    public abstract void setName(String name);

    public void printName() {
        System.out.println(this.name);
    }
}
