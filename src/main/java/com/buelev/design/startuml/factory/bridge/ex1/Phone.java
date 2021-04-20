package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: Phone
 * date: 2021-03-11 15:13
 * author: buelev
 * version: 1.0
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void call() {
        brand.call();
    }

    protected void close() {
        brand.close();
    }
}
