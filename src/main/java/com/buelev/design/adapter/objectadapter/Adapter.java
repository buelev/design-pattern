package com.buelev.design.adapter.objectadapter;

/**
 * description: Adapter
 * date: 2020-06-12 00:32
 * author: buelev
 * version: 1.0
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        //.....
        adaptee.adapterReqeust();
        ///
    }
}
