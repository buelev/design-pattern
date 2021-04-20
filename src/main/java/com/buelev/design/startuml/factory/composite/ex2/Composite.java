package com.buelev.design.startuml.factory.composite.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Composite
 * date: 2021-03-12 17:02
 * author: buelev
 * version: 1.0
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    protected void add(Component component) {
        list.add(component);
    }

    @Override
    protected void remove(Component component) {
        list.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("=========" + getName() + "===========");
        for (Component component : list) {
            component.print();
        }
    }
}
