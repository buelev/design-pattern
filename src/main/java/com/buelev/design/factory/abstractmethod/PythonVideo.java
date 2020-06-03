package com.buelev.design.factory.abstractmethod;

import com.buelev.design.factory.factorymethod.VideoFactory;

/**
 * description: PythonVideo
 * date: 2020-06-03 17:32
 * author: buelev
 * version: 1.0
 */
public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产python视频");
    }
}
