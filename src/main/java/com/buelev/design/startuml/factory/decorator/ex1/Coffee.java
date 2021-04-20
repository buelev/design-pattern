package com.buelev.design.startuml.factory.decorator.ex1;

/**
 * description: Coffee
 * date: 2021-03-11 16:51
 * author: buelev
 * version: 1.0
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }

}
