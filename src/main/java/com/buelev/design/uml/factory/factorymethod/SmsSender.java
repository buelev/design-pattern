package com.buelev.design.uml.factory.factorymethod;

/**
 * description: SmsSender
 * date: 2021-04-16 09:37
 * author: buelev
 * version: 1.0
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
