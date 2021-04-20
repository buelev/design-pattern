package com.buelev.design.uml.builder;

/**
 * description: Director
 * date: 2021-04-16 15:08
 * author: buelev
 * version: 1.0
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product construct() {
        builder.buildGround();
        builder.buildCement();
        builder.buildRoof();
        return builder.product();
    }
}
