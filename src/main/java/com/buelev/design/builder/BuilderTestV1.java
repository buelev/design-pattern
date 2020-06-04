package com.buelev.design.builder;

/**
 * description: BuilderTestV1
 * date: 2020-06-04 17:28
 * author: buelev
 * version: 1.0
 */
public class BuilderTestV1 {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);
    }
}
