package com.buelev.design.startuml.factory.factorymethod;

/**
 * description: ExpressFactory
 * date: 2021-03-09 22:54
 * author: buelev
 * version: 1.0
 */
public class ExpressFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new ExpressSender();
    }
}
