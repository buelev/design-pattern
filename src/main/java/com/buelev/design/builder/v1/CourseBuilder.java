package com.buelev.design.builder.v1;

/**
 * description: CourseBuilder
 * date: 2020-06-07 23:08
 * author: buelev
 * version: 1.0
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
