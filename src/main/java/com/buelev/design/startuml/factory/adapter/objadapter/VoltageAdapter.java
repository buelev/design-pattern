package com.buelev.design.startuml.factory.adapter.objadapter;

import com.buelev.design.startuml.factory.adapter.classadapter.Voltage5V;

/**
 * description: VoltageAdapter
 * date: 2021-03-10 19:21
 * author: buelev
 * version: 1.0
 */
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int out5v = voltage220V.output220V();
        System.out.println("适配器输出电压:" + out5v + "V");
        return out5v;
    }
}
