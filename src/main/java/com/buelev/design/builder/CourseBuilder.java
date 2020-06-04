package com.buelev.design.builder;

/**
 * description: CourseBuilder
 * date: 2020-06-04 16:42
 * author: buelev
 * version: 1.0
 */
public abstract class CourseBuilder {
    public abstract void courseName(String courseName);
    public abstract void coursePPT(String coursePPT);
    public abstract void courseVideo(String courseVideo);
    public abstract void courseArticle(String courseArticle);
    public abstract void courseAQ(String courseQA);

    public abstract Course makeCourse();
}
