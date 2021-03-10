package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: PythonCourseFactory
 * date: 2021-03-10 00:36
 * author: buelev
 * version: 1.0
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video productVideo() {
        return new PythonVideo();
    }

    @Override
    public Article produceArticle() {
        return new PythonArticle();
    }
}
