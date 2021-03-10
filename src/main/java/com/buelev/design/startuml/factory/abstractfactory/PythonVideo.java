package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: PythonVideo
 * date: 2021-03-10 00:30
 * author: buelev
 * version: 1.0
 */
public class PythonVideo implements Video{
    @Override
    public void makeVideo() {
        System.out.println("录制python视频");
    }
}
