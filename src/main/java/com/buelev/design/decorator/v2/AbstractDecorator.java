package com.buelev.design.decorator.v2;

/**
 * description: AbstractDecorator
 * date: 2020-06-09 16:55
 * author: buelev
 * version: 1.0
 */
public abstract class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    public Integer cost() {
        return aBatterCake.cost();
    }
}
