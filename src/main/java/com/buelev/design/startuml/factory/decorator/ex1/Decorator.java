package com.buelev.design.startuml.factory.decorator.ex1;

/**
 * description: Decorator
 * date: 2021-03-11 16:27
 * author: buelev
 * version: 1.0
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDesc() {
        return "添加配料的价格为:" + super.getPrice() + "总的价格为:" + this.cost();
    }
}
