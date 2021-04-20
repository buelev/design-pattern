package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: Apple
 * date: 2021-03-11 15:18
 * author: buelev
 * version: 1.0
 */
public class Apple implements Brand{
    @Override
    public void open() {
        System.out.println("apple开机");
    }

    @Override
    public void call() {
        System.out.println("apple打电话");
    }

    @Override
    public void close() {
        System.out.println("apple关机");
    }
}
