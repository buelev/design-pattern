package com.buelev.design.startuml.factory.decorator.ex1;

/**
 * description: CoffeBar
 * date: 2021-03-11 16:56
 * author: buelev
 * version: 1.0
 */
public class CoffeBar {
    public static void main(String[] args) {
        Expresso expresso = new Expresso();
        Milk milk = new Milk(expresso);
        float cost = milk.cost();
        String desc = milk.getDesc();
        System.out.println(cost);
        System.out.println(desc);
    }
}
