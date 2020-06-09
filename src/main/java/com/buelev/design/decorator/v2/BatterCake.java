package com.buelev.design.decorator.v2;

/**
 * description: BatterCake
 * date: 2020-06-09 16:56
 * author: buelev
 * version: 1.0
 */
public class BatterCake extends ABatterCake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public Integer cost() {
        return 8;
    }
}
