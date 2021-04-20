package com.buelev.design.uml.builder;

/**
 * description: Client
 * date: 2021-04-16 15:15
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreateBuilder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
