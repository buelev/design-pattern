package com.buelev.design.decorator.v1;

/**
 * description: BattercakeWithEgg
 * date: 2020-06-08 11:07
 * author: buelev
 * version: 1.0
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
