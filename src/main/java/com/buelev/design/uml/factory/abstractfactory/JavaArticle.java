package com.buelev.design.uml.factory.abstractfactory;

/**
 * description: JavaArticle
 * date: 2021-04-16 11:05
 * author: buelev
 * version: 1.0
 */
public class JavaArticle implements Article {
    @Override
    public void writeArticle() {
        System.out.println("编写java手记");
    }
}
