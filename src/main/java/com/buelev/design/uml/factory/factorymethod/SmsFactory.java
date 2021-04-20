package com.buelev.design.uml.factory.factorymethod;

/**
 * description: SmsFactory
 * date: 2021-04-16 09:39
 * author: buelev
 * version: 1.0
 */
public class SmsFactory implements Provider{
    @Override
    public Sender product() {
        return new SmsSender();
    }
}
