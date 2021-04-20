package com.buelev.design.uml.bridge;

/**
 * description: MobilePhoneAbstraction
 * date: 2021-04-16 17:38
 * author: buelev
 * version: 1.0
 */
public abstract class MobilePhoneAbstraction {
    public SoftImplementor softImplementor;

    public MobilePhoneAbstraction(SoftImplementor softImplementor) {
        this.softImplementor = softImplementor;
    }

    public abstract void run();
}
