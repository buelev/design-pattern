package com.buelev.design.factory.simplefactory;

import org.apache.commons.lang3.StringUtils;

/**
 * description: VideoFactory
 * date: 2020-06-03 16:07
 * author: buelev
 * version: 1.0
 */
public class VideoFactory {
//    Video video = null;
//
//    public Video produceVideo(Class clazz) {
//
//        try {
//            video = (Video) Class.forName(clazz.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }

    //    public Video getVideo(String type) {
//        if (StringUtils.equals("java", type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
    public Video produceJavaVideo() {
        return new JavaVideo();
    }
}
