package com.buelev.design.uml.bridge;

/**
 * description: Client
 * date: 2021-04-16 17:42
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        SoftImplementor chatSoft = new ChatSoft();
        HuaWeiMobilePhone huaWeiMobilePhone = new HuaWeiMobilePhone(chatSoft);
        huaWeiMobilePhone.run();
        huaWeiMobilePhone.gpu();
    }
}
