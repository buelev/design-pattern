package com.buelev.design.decorator.v2;

/**
 * description: DecoratorTest
 * date: 2020-06-12 00:14
 * author: buelev
 * version: 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        System.out.println(aBatterCake.desc() + " 销售价格为:" + aBatterCake.cost());
    }
}
