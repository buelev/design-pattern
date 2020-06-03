package com.buelev.design.factory.factorymethod;

/**
 * description: MethodFactoryMain
 * date: 2020-06-03 17:13
 * author: buelev
 * version: 1.0
 */
public class MethodFactoryMain {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
