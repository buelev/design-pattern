package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: SidlePhone
 * date: 2021-03-11 15:24
 * author: buelev
 * version: 1.0
 */
public class SidlePhone extends Phone {
    public SidlePhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("滑盖手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("滑盖手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("滑盖手机");
    }
}
