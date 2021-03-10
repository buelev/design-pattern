package com.buelev.design.adapter.objectadapter;

/**
 * description: ConcreteTarget
 * date: 2020-06-12 00:33
 * author: buelev
 * version: 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
