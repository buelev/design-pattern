package com.buelev.design.factory.abstractmethod;

/**
 * description: PythonCourseFactory
 * date: 2020-06-03 17:30
 * author: buelev
 * version: 1.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video produceVideo() {
        return new PythonVideo();
    }

    @Override
    public Article writeArticle() {
        return new PythonArticle();
    }
}
