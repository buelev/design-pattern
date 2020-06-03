package com.buelev.design.factory.factorymethod;

/**
 * description: PythonVideoFactory
 * date: 2020-06-03 17:06
 * author: buelev
 * version: 1.0
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
