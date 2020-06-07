package com.buelev.design.builder.v2;

/**
 * description: CourseBuilderV2
 * date: 2020-06-05 00:47
 * author: buelev
 * version: 1.0
 */
public class CourseBuilderV2 {
    public static void main(String[] args) {
        Course.CourseBuilder builder = new Course.CourseBuilder()
                .courseName("a")
                .courseArticle("b")
                .coursePPT("c")
                .courseVideo("d")
                .courseQA("e");
        Course course = builder.build();
        System.out.println(course);
    }
}
