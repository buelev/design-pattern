package com.buelev.design.startuml.factory.adapter.classadapter;

/**
 * description: Voltage220V
 * date: 2021-03-10 17:06
 * author: buelev
 * version: 1.0
 */
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("输出电压:" + src + "V");
        return src;
    }
}
