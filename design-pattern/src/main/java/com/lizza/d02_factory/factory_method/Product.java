package com.lizza.d02_factory.factory_method;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public abstract class Product {

    protected String name;

    public abstract void setName();

    public void info() {
        System.out.println("产品信息:" + name);
    }
}
