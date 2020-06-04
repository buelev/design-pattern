package com.buelev.design.factory.factory.factorymethod;

/**
 * description: FactoryMethodTest
 * date: 2020-06-04 15:49
 * author: buelev
 * version: 1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        JavaVideoFactory factory = new JavaVideoFactory();
        Video video = factory.produce();
        video.produce();;
    }
}
