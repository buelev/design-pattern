package com.buelev.design.decorator.v2;

/**
 * description: DecoratorTest
 * date: 2020-06-09 17:02
 * author: buelev
 * version: 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        aBatterCake = new EggDecotator(aBatterCake);
        aBatterCake = new EggDecotator(aBatterCake);
        System.out.println(aBatterCake.getDesc() + " 销售价格是:" + aBatterCake.cost());
    }
}
