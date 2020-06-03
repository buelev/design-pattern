package com.buelev.design.factory.abstractmethod;

/**
 * description: PythonArticle
 * date: 2020-06-03 17:34
 * author: buelev
 * version: 1.0
 */
public class PythonArticle implements Article {
    @Override
    public void write() {
        System.out.println("编写python手记");
    }
}
