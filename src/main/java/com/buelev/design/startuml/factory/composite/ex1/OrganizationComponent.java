package com.buelev.design.startuml.factory.composite.ex1;

/**
 * description: OrganizationComponent
 * date: 2021-03-12 15:55
 * author: buelev
 * version: 1.0
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    protected void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    protected abstract void print();
}
