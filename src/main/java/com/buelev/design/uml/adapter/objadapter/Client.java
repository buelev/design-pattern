package com.buelev.design.uml.adapter.objadapter;

/**
 * description: Client
 * date: 2021-04-16 15:56
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Voltage5V voltageAdapter = new VoltageAdapter(new Voltage220V());
        voltageAdapter.output5V();
    }
}
