package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: HuaWei
 * date: 2021-03-11 15:19
 * author: buelev
 * version: 1.0
 */
public class HuaWei implements Brand{
    @Override
    public void open() {
        System.out.println("华为开机");
    }

    @Override
    public void call() {
        System.out.println("华为打电话");
    }

    @Override
    public void close() {
        System.out.println("华为关机");
    }
}
