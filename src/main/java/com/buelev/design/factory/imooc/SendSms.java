package com.buelev.design.factory.imooc;

/**
 * description: SendSms
 * date: 2020-05-25 16:32
 * author: buelev
 * version: 1.0
 */
public class SendSms implements Sender{
    public void send() {
        System.out.println("发送短信....");
    }
}
