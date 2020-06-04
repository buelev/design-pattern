package com.buelev.design.factory.factory.factorymethod;

/**
 * description: PythonVideo
 * date: 2020-06-04 15:48
 * author: buelev
 * version: 1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
