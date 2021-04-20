package com.buelev.design.uml.factory.factorymethod;

/**
 * description: Client
 * date: 2021-04-16 09:40
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Provider expresserFactory = new ExpresserFactory();
        Sender product = expresserFactory.product();
        product.send();
    }
}
