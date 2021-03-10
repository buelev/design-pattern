package com.buelev.design.adapter.classadapter;

/**
 * description: Adapter
 * date: 2020-06-12 00:21
 * author: buelev
 * version: 1.0
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...doSomething
        super.adapterRequest();
        // doSomething
    }
}
