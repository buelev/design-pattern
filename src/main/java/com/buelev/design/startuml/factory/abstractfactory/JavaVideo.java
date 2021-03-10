package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: JavaVideo
 * date: 2021-03-10 00:28
 * author: buelev
 * version: 1.0
 */
public class JavaVideo implements Video {
    @Override
    public void makeVideo() {
        System.out.println("录制Java视频");
    }
}
