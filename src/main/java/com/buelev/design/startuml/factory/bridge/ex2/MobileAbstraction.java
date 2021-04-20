package com.buelev.design.startuml.factory.bridge.ex2;

/**
 * description: MobileAbstraction
 * date: 2021-03-11 15:38
 * author: buelev
 * version: 1.0
 */
public abstract class MobileAbstraction {
    protected SoftImplementor softImplementor;

    public MobileAbstraction(SoftImplementor softImplementor) {
        this.softImplementor = softImplementor;
    }

    public abstract void run();
}
