package com.buelev.design.adapter.classadapter;

/**
 * description: ClassAdapterTest
 * date: 2020-06-12 00:23
 * author: buelev
 * version: 1.0
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
