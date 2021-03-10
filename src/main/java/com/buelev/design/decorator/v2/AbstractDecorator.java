package com.buelev.design.decorator.v2;

/**
 * description: AbstractDecorator
 * date: 2020-06-12 00:10
 * author: buelev
 * version: 1.0
 */
public abstract class AbstractDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String desc() {
        return aBatterCake.desc();
    }

    @Override
    public int cost() {
        return aBatterCake.cost();
    }
}
