package com.buelev.design.startuml.factory.composite.ex2;

/**
 * description: Component
 * date: 2021-03-12 16:58
 * author: buelev
 * version: 1.0
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    protected abstract void add(Component component);
    protected abstract void remove(Component component);
    protected abstract void print();
}
