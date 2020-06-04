package com.buelev.design.builder;

/**
 * description: CourseActualBuilder
 * date: 2020-06-04 17:15
 * author: buelev
 * version: 1.0
 */
public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();

    @Override
    public void courseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void coursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void courseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void courseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void courseAQ(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
