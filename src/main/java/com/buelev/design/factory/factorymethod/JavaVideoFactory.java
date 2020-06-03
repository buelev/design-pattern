package com.buelev.design.factory.factorymethod;

/**
 * description: JavaVideoFactory
 * date: 2020-06-03 17:06
 * author: buelev
 * version: 1.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
