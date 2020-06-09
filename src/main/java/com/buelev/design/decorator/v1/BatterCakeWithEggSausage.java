package com.buelev.design.decorator.v1;

/**
 * description: BatterCakeWithEggSausage
 * date: 2020-06-08 11:09
 * author: buelev
 * version: 1.0
 */
public class BatterCakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + "加根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
