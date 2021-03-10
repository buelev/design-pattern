package com.buelev.design.startuml.factory.factorymethod;

/**
 * description: EmailProduce
 * date: 2021-03-09 22:58
 * author: buelev
 * version: 1.0
 */
public class EmailProduce implements SenderFactory {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
