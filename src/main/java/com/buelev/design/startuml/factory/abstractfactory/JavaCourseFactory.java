package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: JavaCourseFactory
 * date: 2021-03-10 00:31
 * author: buelev
 * version: 1.0
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video productVideo() {
        return new JavaVideo();
    }

    @Override
    public Article produceArticle() {
        return new JavaArticle();
    }
}
