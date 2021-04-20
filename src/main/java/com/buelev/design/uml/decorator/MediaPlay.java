package com.buelev.design.uml.decorator;

/**
 * description: MediaPlay
 * date: 2021-04-20 14:36
 * author: buelev
 * version: 1.0
 */
public abstract class MediaPlay {
    public abstract String getMediaName();//播放文件的名称

    public abstract int getMediaSeconds();//播放文件的时长

    public abstract String getMediaContent();//播放文件的内容

    public void play() {
        System.out.println("Media：" + getMediaName() + "(累计时长：" + getMediaSeconds() + " 秒) 正在播放");
        try {
            for (int i = 1; i <= getMediaSeconds(); i++) {
                Thread.sleep(1000);
                System.out.println("当前播放第 " + i + " 秒，" + getMediaContent() + "...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
