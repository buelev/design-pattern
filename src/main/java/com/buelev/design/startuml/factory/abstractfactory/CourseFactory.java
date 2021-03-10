package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: CourseFactory
 * date: 2021-03-10 00:31
 * author: buelev
 * version: 1.0
 */
public interface CourseFactory {
    Video productVideo();
    Article produceArticle();
}
