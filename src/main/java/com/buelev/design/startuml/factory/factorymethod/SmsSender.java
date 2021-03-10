package com.buelev.design.startuml.factory.factorymethod;

/**
 * description: SmsSender
 * date: 2021-03-09 22:01
 * author: buelev
 * version: 1.0
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
