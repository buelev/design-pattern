package com.buelev.design.uml.bridge;

/**
 * description: HuaWeiMobilePhone
 * date: 2021-04-16 17:38
 * author: buelev
 * version: 1.0
 */
public class HuaWeiMobilePhone extends MobilePhoneAbstraction {
    public HuaWeiMobilePhone(SoftImplementor softImplementor) {
        super(softImplementor);
    }

    @Override
    public void run() {
        softImplementor.rawrun();
    }

    public void gpu() {
        System.out.println("GPU Turbo Running start....");
        this.run();
        System.out.println("GPU Turbo Running end....");
    }
}
