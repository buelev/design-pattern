package com.buelev.design.factory.abstractmethod;

/**
 * description: CourseFactory
 * date: 2020-06-03 17:27
 * author: buelev
 * version: 1.0
 */
public interface CourseFactory {
    Video produceVideo();

    Article writeArticle();
}
