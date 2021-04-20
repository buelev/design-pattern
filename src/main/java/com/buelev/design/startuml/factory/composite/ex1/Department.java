package com.buelev.design.startuml.factory.composite.ex1;

/**
 * description: Department
 * date: 2021-03-12 16:43
 * author: buelev
 * version: 1.0
 */
public class Department extends OrganizationComponent{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }
}
