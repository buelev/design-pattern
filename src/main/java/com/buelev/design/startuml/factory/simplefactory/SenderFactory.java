package com.buelev.design.startuml.factory.simplefactory;

/**
 * description: SenderFactory
 * date: 2021-03-09 22:01
 * author: buelev
 * version: 1.0
 */
public class SenderFactory {
    public Sender produceExpress() {
        return new ExpressSender();
    }

    public Sender produceEmail() {
        return new EmailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
