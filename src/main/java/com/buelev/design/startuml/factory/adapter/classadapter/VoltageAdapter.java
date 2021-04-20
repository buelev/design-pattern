package com.buelev.design.startuml.factory.adapter.classadapter;

/**
 * description: VoltageAdapter
 * date: 2021-03-10 17:08
 * author: buelev
 * version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int src = super.output220V();
        return src / 44;
    }
}
