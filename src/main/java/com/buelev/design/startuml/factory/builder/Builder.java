package com.buelev.design.startuml.factory.builder;

/**
 * description: Builder
 * date: 2021-03-10 15:09
 * author: buelev
 * version: 1.0
 */
public interface Builder {
    void productGround();

    void productCement();

    void productRoof();

    Product buildProduct();
}
