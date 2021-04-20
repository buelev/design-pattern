package com.buelev.design.uml.adapter.classjadapter;

/**
 * description: VoltageAdapter
 * date: 2021-04-16 15:54
 * author: buelev
 * version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int i = output220V();
        int output5V = i / 44;
        System.out.println("适配器转化为" + output5V + "V");
        return output5V;
    }
}
