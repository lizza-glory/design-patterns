package com.lizza.d02_factory.factory_method;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class FactoryB implements Factory {

    @Override
    public Product create() {
        Product product = new ProductB();
        product.setName();
        return product;
    }
}
