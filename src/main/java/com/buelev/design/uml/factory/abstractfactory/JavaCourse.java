package com.buelev.design.uml.factory.abstractfactory;

/**
 * description: JavaCourse
 * date: 2021-04-16 11:06
 * author: buelev
 * version: 1.0
 */
public class JavaCourse implements CourseFactory{
    @Override
    public Video productVideo() {
        return new JavaVideo();
    }

    @Override
    public Article productArticle() {
        return new JavaArticle();
    }
}
