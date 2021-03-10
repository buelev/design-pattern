package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: Client
 * date: 2021-03-10 00:38
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        Video video = javaCourseFactory.productVideo();
        Article article = javaCourseFactory.produceArticle();
        video.makeVideo();
        article.writeArticle();
    }
}
