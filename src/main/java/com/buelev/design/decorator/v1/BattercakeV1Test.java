package com.buelev.design.decorator.v1;

/**
 * description: BattercakeV1Test
 * date: 2020-06-08 11:11
 * author: buelev
 * version: 1.0
 */
public class BattercakeV1Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());
        BattercakeWithEgg withEgg = new BattercakeWithEgg();
        System.out.println(withEgg.getDesc() + " 销售价格:" + withEgg.cost());
        BatterCakeWithEggSausage withEggSausage = new BatterCakeWithEggSausage();
        System.out.println(withEggSausage.getDesc() + " 销售价格:" + withEggSausage.cost());
    }
}
