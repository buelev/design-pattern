package com.buelev.design.uml.decorator;

/**
 * description: VideoPlay
 * date: 2021-04-20 14:38
 * author: buelev
 * version: 1.0
 */
public class VideoPlay extends MediaPlay {
    private String videoContent;//视频内容g
    private String videoName;//视屏的名称

    public VideoPlay(String videoContent, String videoName) {
        this.videoContent = videoContent;
        this.videoName = videoName;
    }

    @Override
    public String getMediaName() {
        return this.videoName;
    }

    @Override
    public int getMediaSeconds() {
        return videoContent.length();
    }

    @Override
    public String getMediaContent() {
        return this.videoContent;
    }
}
