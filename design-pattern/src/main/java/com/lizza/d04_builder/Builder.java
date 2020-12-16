package com.lizza.d04_builder;

/**
 * 建造者要素
 * 1. 产品
 * 2. 生产产品的过程
 */
public abstract class Builder {

    // 产品
    protected House house = new House();

    // 流程
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 建造成品
    public House build() {
        return house;
    }
}
