package com.buelev.design.startuml.factory.bridge.ex1;

/**
 * description: Client
 * date: 2021-03-11 15:27
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Phone foldPhone = new FoldPhone(apple);
        foldPhone.open();
        foldPhone.call();
        foldPhone.close();
    }
}
