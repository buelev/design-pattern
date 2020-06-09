package com.buelev.design.decorator.v2;

/**
 * description: SausageDecorator
 * date: 2020-06-09 17:00
 * author: buelev
 * version: 1.0
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加个双汇";
    }

    @Override
    public Integer cost() {
        return super.cost() + 2;
    }
}
