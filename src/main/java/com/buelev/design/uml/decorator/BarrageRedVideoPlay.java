package com.buelev.design.uml.decorator;

/**
 * description: BarrageRedVideoPlay
 * date: 2021-04-20 14:41
 * author: buelev
 * version: 1.0
 */
public class BarrageRedVideoPlay extends MediaPlay {
    private MediaPlay mediaPlay;

    public BarrageRedVideoPlay(MediaPlay mediaPlay) {
        this.mediaPlay = mediaPlay;
    }

    @Override
    public String getMediaName() {
        return mediaPlay.getMediaName() + "(已开启弹幕)";
    }

    @Override
    public int getMediaSeconds() {
        return mediaPlay.getMediaSeconds();
    }

    @Override
    public String getMediaContent() {
        return "---+++*** " + mediaPlay.getMediaContent() + "（弹幕中）---+++***";
    }
}
