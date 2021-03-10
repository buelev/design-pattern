package com.buelev.design.startuml.factory.abstractfactory;

/**
 * description: PythonArticle
 * date: 2021-03-10 00:30
 * author: buelev
 * version: 1.0
 */
public class PythonArticle implements Article{
    @Override
    public void writeArticle() {
        System.out.println("编写python手记");
    }
}
