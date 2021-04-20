package com.buelev.design.startuml.factory.decorator.ex1;

/**
 * description: Chocolate
 * date: 2021-03-11 16:54
 * author: buelev
 * version: 1.0
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3);
    }

}
