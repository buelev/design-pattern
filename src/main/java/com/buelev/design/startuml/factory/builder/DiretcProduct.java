package com.buelev.design.startuml.factory.builder;

/**
 * description: DiretcProduct
 * date: 2021-03-10 15:14
 * author: buelev
 * version: 1.0
 */
public class DiretcProduct {
    private Builder builder;

    public DiretcProduct(Builder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.productCement();
        builder.productGround();
        builder.productRoof();
        return builder.buildProduct();
    }
}
