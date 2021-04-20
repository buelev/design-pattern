package com.buelev.design.uml.factory.abstractfactory;

/**
 * description: Client
 * date: 2021-04-16 11:06
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CourseFactory javaCourse = new JavaCourse();
        Article article = javaCourse.productArticle();
        Video video = javaCourse.productVideo();
        article.writeArticle();
        video.makeVideo();
    }
}
