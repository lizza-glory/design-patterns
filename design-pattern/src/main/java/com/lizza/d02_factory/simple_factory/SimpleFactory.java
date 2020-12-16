package com.lizza.d02_factory.simple_factory;

/**
 * 简单工厂
 */
public enum SimpleFactory {

    INSTANCE;

    public Product createProductByType(String type) {
        Product product;
        switch (type) {
            case "A":
                product = new Product_A();
                product.setName("产品A");
                return product;
            case "B":
                product = new Product_B();
                product.setName("产品B");
                return product;
            case "C":
                product = new Product_C();
                product.setName("产品C");
                return product;
            default:
                return null;
        }
    }
}
