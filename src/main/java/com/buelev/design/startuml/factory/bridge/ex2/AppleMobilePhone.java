package com.buelev.design.startuml.factory.bridge.ex2;

/**
 * description: AppleMobilePhone
 * date: 2021-03-11 15:41
 * author: buelev
 * version: 1.0
 */
public class AppleMobilePhone extends MobileAbstraction {
    public AppleMobilePhone(SoftImplementor softImplementor) {
        super(softImplementor);
    }

    @Override
    public void run() {
        this.softImplementor.rawrun();
    }

    //添加自己的方法
    public void gpuTorborRun() {
        System.out.println("GPU TurBo Running start....");
        this.run();
        System.out.println("GPU TurBo Running end...");
    }
}
