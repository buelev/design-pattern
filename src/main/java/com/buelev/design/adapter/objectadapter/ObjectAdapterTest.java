package com.buelev.design.adapter.objectadapter;

/**
 * description: ObjectAdapterTest
 * date: 2020-06-12 00:34
 * author: buelev
 * version: 1.0
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        adaptee.adapterReqeust();

        Target target = new ConcreteTarget();
        target.request();
    }
}
