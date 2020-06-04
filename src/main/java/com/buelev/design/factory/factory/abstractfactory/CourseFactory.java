package com.buelev.design.factory.factory.abstractfactory;

/**
 * description: CourseFactory
 * date: 2020-06-04 16:07
 * author: buelev
 * version: 1.0
 */
public abstract class CourseFactory {
    public abstract Video produceVideo();

    public abstract Article produceArticle();
}
