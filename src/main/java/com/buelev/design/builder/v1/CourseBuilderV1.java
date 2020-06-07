package com.buelev.design.builder.v1;

/**
 * description: CourseBuilderV1
 * date: 2020-06-07 23:15
 * author: buelev
 * version: 1.0
 */
public class CourseBuilderV1 {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new ActualCourseBuilder();
        Coach coach = new Coach(courseBuilder);
        Course course = coach.makeCourse("a", "b", "c", "d", "e");
        System.out.println(course);
    }
}
