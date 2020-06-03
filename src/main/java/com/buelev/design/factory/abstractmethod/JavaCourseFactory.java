package com.buelev.design.factory.abstractmethod;

/**
 * description: JavaCourseFactory
 * date: 2020-06-03 17:28
 * author: buelev
 * version: 1.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video produceVideo() {
        return new JavaVideo();
    }

    @Override
    public Article writeArticle() {
        return new JavaArticle();
    }
}
