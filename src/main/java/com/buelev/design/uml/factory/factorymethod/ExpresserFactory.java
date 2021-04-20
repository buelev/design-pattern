package com.buelev.design.uml.factory.factorymethod;

/**
 * description: ExpresserFactory
 * date: 2021-04-16 09:38
 * author: buelev
 * version: 1.0
 */
public class ExpresserFactory implements Provider{
    @Override
    public Sender product() {
        return new ExpresserSender();
    }
}
