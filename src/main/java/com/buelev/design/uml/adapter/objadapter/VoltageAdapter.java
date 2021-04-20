package com.buelev.design.uml.adapter.objadapter;

/**
 * description: VoltageAdapter
 * date: 2021-04-16 15:54
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
        int i = voltage220V.output220V();
        int output5V = i / 44;
        System.out.println("适配器转化为" + output5V + "V");
        return output5V;
    }
}
