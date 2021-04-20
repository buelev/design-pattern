package com.buelev.design.startuml.factory.bridge.ex2;

/**
 * description: ChartSoft
 * date: 2021-03-11 15:40
 * author: buelev
 * version: 1.0
 */
public class ChartSoft implements SoftImplementor {
    @Override
    public void rawrun() {
        System.out.println("ChartSoft rawrun...");
    }
}
