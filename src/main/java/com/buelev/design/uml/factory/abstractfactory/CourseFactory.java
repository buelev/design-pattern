package com.buelev.design.uml.factory.abstractfactory;


/**
 * description: CourseFactory
 * date: 2021-04-16 10:37
 * author: buelev
 * version: 1.0
 */
public interface CourseFactory {
    Video productVideo();
    Article productArticle();
}
