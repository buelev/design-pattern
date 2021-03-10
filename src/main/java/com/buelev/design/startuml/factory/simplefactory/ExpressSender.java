package com.buelev.design.startuml.factory.simplefactory;

/**
 * description: ExpressSender
 * date: 2021-03-09 21:59
 * author: buelev
 * version: 1.0
 */
public class ExpressSender implements Sender{
    @Override
    public void send() {
        System.out.println("发送快递");
    }
}
