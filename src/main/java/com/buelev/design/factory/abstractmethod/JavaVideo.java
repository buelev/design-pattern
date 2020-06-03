package com.buelev.design.factory.abstractmethod;

/**
 * description: JavaVideo
 * date: 2020-06-03 17:29
 * author: buelev
 * version: 1.0
 */
public class JavaVideo implements Video{
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
