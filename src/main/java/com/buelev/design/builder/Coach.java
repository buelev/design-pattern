package com.buelev.design.builder;

/**
 * description: Coach
 * date: 2020-06-04 16:42
 * author: buelev
 * version: 1.0
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo,
                             String courseArticle, String courseQA) {
        this.courseBuilder.courseName(courseName);
        this.courseBuilder.coursePPT(coursePPT);
        this.courseBuilder.courseArticle(courseArticle);
        this.courseBuilder.courseVideo(courseVideo);
        this.courseBuilder.courseAQ(courseQA);
        return courseBuilder.makeCourse();
    }
}
