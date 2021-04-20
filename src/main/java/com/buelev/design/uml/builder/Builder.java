package com.buelev.design.uml.builder;

/**
 * description: Builder
 * date: 2021-04-16 15:03
 * author: buelev
 * version: 1.0
 */
public interface Builder {
    void buildGround();

    void buildCement();

    void buildRoof();
    Product product();
}
