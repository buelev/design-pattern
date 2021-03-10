package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: JavaArticle
 * date: 2021-03-10 00:29
 * author: buelev
 * version: 1.0
 */
public class JavaArticle implements Article {
    @Override
    public void writeArticle() {
        System.out.println("编写java手记");
    }
}
