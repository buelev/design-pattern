package com.buelev.design.factory.factory.abstractfactory;

/**
 * description: JavaCourseFactory
 * date: 2020-06-04 16:22
 * author: buelev
 * version: 1.0
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    public Video produceVideo() {
        return new JavaVideo();
    }

    @Override
    public Article produceArticle() {
        return new JavaArticle();
    }
}
