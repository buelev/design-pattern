package com.buelev.design.builder.v1;

/**
 * description: Coach
 * date: 2020-06-07 23:10
 * author: buelev
 * version: 1.0
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public Coach(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseArticle,
                             String courseVideo, String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        this.courseBuilder.buildCourseVideo(courseVideo);
        return courseBuilder.makeCourse();
    }
}
