package com.buelev.design.factory.factory.simplefactory;

/**
 * description: VideoFactory
 * date: 2020-06-04 11:03
 * author: buelev
 * version: 1.0
 */
public class VideoFactory {
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
