package com.buelev.design.startuml.factory.factorymethod;

/**
 * description: SmsProduce
 * date: 2021-03-09 22:56
 * author: buelev
 * version: 1.0
 */
public class SmsProduce implements SenderFactory{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
