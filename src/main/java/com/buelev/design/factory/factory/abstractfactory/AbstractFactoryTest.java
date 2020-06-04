package com.buelev.design.factory.factory.abstractfactory;

/**
 * description: AbstractFactoryTest
 * date: 2020-06-04 16:24
 * author: buelev
 * version: 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        Video video = javaCourseFactory.produceVideo();
        video.produce();
        Article article = javaCourseFactory.produceArticle();
        article.article();
    }
}
