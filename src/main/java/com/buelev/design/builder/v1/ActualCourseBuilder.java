package com.buelev.design.builder.v1;

/**
 * description: ActualCourseBuilder
 * date: 2020-06-07 23:13
 * author: buelev
 * version: 1.0
 */
public class ActualCourseBuilder extends CourseBuilder {
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCouseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
