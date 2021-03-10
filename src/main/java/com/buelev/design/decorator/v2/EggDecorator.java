package com.buelev.design.decorator.v2;

/**
 * description: EggDecorator
 * date: 2020-06-12 00:12
 * author: buelev
 * version: 1.0
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String desc() {
        return super.desc() + " 加个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
