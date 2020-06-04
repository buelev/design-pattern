package com.buelev.design.factory.factory.factorymethod;

/**
 * description: JavaVideo
 * date: 2020-06-04 15:45
 * author: buelev
 * version: 1.0
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
