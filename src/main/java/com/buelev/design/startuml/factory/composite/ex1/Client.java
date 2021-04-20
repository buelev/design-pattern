package com.buelev.design.startuml.factory.composite.ex1;

/**
 * description: Client
 * date: 2021-03-12 16:44
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学","中国理工科顶级大学");
        College college = new College("计算机学院", "计算机学院");
        College college1 = new College("信息工程学院", "信息工程学院");

        college.add(new Department("软件工程","软件工程还行"));
        college.add(new Department("网络工程","网络工程还行"));

        college1.add(new Department("安全工程","安全工程还不错"));

        university.add(college);
        university.add(college1);

        university.print();
    }
}
