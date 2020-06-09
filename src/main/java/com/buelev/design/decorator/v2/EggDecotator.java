package com.buelev.design.decorator.v2;

/**
 * description: EggDecotator
 * date: 2020-06-09 16:57
 * author: buelev
 * version: 1.0
 */
public class EggDecotator extends AbstractDecorator {
    public EggDecotator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加个鸡蛋";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}
