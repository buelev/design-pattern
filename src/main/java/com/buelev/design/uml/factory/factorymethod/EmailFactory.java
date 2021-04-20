package com.buelev.design.uml.factory.factorymethod;

/**
 * description: EmailFactory
 * date: 2021-04-16 09:39
 * author: buelev
 * version: 1.0
 */
public class EmailFactory implements Provider{
    @Override
    public Sender product() {
        return new EmailSender();
    }
}
