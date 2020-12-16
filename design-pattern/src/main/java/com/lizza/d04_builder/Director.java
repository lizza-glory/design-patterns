package com.lizza.d04_builder;

/**
 *
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House build() {
        builder.buildBase();
        builder.buildWall();
        builder.buildRoof();
        return builder.build();
    }
}
