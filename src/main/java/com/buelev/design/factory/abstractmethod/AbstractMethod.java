package com.buelev.design.factory.abstractmethod;

/**
 * description: AbstractMethod
 * date: 2020-06-03 17:40
 * author: buelev
 * version: 1.0
 */
public class AbstractMethod {
    public static void main(String[] args) {
        //创建java工厂
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Video video = javaCourseFactory.produceVideo();
        video.produce();
        Article article = javaCourseFactory.writeArticle();
        article.write();
    }
}
