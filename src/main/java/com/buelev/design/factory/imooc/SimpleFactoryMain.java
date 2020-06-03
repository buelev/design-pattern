package com.buelev.design.factory.imooc;

/**
 * description: SimpleFactoryMain
 * date: 2020-05-25 16:38
 * author: buelev
 * version: 1.0
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("email");
        sender.send();
    }
}
