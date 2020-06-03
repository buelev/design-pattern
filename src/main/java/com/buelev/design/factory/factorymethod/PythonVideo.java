package com.buelev.design.factory.factorymethod;

/**
 * description: PythonVideo
 * date: 2020-06-03 17:06
 * author: buelev
 * version: 1.0
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("生产python视频");
    }
}
