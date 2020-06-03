package com.buelev.design.factory.abstractmethod;

/**
 * description: JavaArticle
 * date: 2020-06-03 17:30
 * author: buelev
 * version: 1.0
 */
public class JavaArticle implements Article {
    @Override
    public void write() {
        System.out.println("编写Java手记");
    }
}
