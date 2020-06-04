package com.buelev.design.factory.factory.abstractfactory;

/**
 * description: JavaVideo
 * date: 2020-06-04 16:23
 * author: buelev
 * version: 1.0
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
