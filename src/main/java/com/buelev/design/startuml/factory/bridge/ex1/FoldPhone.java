package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: FoldPhone
 * date: 2021-03-11 15:22
 * author: buelev
 * version: 1.0
 */
public class FoldPhone extends Phone {

    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立式手机");
    }
}
