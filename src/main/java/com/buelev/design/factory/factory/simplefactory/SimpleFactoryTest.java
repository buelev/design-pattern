package com.buelev.design.factory.factory.simplefactory;

/**
 * description: SimpleFactoryTest
 * date: 2020-06-04 11:24
 * author: buelev
 * version: 1.0
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        video.produce();
    }
}
