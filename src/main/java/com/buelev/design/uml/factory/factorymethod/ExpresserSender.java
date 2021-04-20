package com.buelev.design.uml.factory.factorymethod;

/**
 * description: ExpresserSender
 * date: 2021-04-16 09:36
 * author: buelev
 * version: 1.0
 */
public class ExpresserSender implements Sender{
    @Override
    public void send() {
        System.out.println("发送顺丰快递");
    }
}
