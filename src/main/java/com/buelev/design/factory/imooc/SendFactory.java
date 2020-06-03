package com.buelev.design.factory.imooc;

import org.apache.commons.lang3.StringUtils;

/**
 * description: SendFactory
 * date: 2020-05-25 16:30
 * author: buelev
 * version: 1.0
 */
public class SendFactory {
    //v1
//    public Sender produce(String type) {
//        if (StringUtils.isBlank(type)) {
//            return null;
//        } else if (StringUtils.endsWithIgnoreCase("email", type)) {
//            return new SendEmail();
//        } else if (StringUtils.endsWithIgnoreCase("smns", type)) {
//            return new SendSms();
//        } else if (StringUtils.endsWithIgnoreCase("express", type)) {
//            return new SendExpress();
//        }
//        return null;
//    }
    //v2
    public Sender produceEmail() {
        return new SendEmail();
    }

    public Sender produceSms() {
        return new SendSms();
    }

    public Sender produceExpress() {
        return new SendExpress();
    }
}
