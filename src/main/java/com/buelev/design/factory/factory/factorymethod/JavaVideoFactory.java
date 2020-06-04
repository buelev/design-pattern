package com.buelev.design.factory.factory.factorymethod;

/**
 * description: JavaVideoFactory
 * date: 2020-06-04 15:45
 * author: buelev
 * version: 1.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video produce() {
        return new JavaVideo();
    }
}
