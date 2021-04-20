package com.buelev.design.uml.decorator;

/**
 * description: Client
 * date: 2021-04-20 14:43
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        VideoPlay videoPlay = new VideoPlay("射雕英雄传", "郭靖大战欧阳锋");
        BarrageRedVideoPlay barrageRedVideoPlay = new BarrageRedVideoPlay(videoPlay);
        videoPlay.play();
        barrageRedVideoPlay.play();
    }
}
