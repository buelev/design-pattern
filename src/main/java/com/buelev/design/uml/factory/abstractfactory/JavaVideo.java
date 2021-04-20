package com.buelev.design.uml.factory.abstractfactory;

/**
 * description: JavaVideo
 * date: 2021-04-16 11:05
 * author: buelev
 * version: 1.0
 */
public class JavaVideo implements Video{
    @Override
    public void makeVideo() {
        System.out.println("录制java视频");
    }
}
