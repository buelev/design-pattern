package com.buelev.design.startuml.factory.decorator.ex1;

/**
 * description: Milk
 * date: 2021-03-11 16:56
 * author: buelev
 * version: 1.0
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(3);
    }
}
