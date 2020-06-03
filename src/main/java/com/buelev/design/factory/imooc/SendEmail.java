package com.buelev.design.factory.imooc;

/**
 * description: SendEmail
 * date: 2020-05-25 16:31
 * author: buelev
 * version: 1.0
 */
public class SendEmail implements Sender{
    public void send() {
        System.out.println("发送邮件...");
    }
}
