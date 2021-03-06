package com.buelev.design.uml.component;

/**
 * description: Component
 * date: 2021-04-20 19:38
 * author: buelev
 * version: 1.0
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

}
