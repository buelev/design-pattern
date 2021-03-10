package com.buelev.design.startuml.factory.factorymethod;

/**
 * description: EmailSender
 * date: 2021-03-09 22:00
 * author: buelev
 * version: 1.0
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
