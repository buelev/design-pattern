package com.buelev.design.uml.bridge;

/**
 * description: XiaoMoMobilePhone
 * date: 2021-04-16 17:41
 * author: buelev
 * version: 1.0
 */
public class XiaoMoMobilePhone extends MobilePhoneAbstraction{
    public XiaoMoMobilePhone(SoftImplementor softImplementor) {
        super(softImplementor);
    }

    @Override
    public void run() {
        softImplementor.rawrun();
    }

    public void gameGPU(){
        System.out.println("Game GPU Turbo Running start....");
        this.run();
        System.out.println("Game GPU Turbo Running end....");
    }
}
