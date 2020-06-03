package com.buelev.design.factory.factorymethod;

/**
 * description: JavaVideo
 * date: 2020-06-03 17:06
 * author: buelev
 * version: 1.0
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
