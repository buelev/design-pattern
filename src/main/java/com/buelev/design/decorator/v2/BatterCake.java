package com.buelev.design.decorator.v2;

/**
 * description: BatterCake
 * date: 2020-06-12 00:10
 * author: buelev
 * version: 1.0
 */
public class BatterCake extends ABatterCake{
    @Override
    public String desc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
