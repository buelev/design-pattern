package com.buelev.design.startuml.factory.composite.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Leaf
 * date: 2021-03-12 16:59
 * author: buelev
 * version: 1.0
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    private List<Component> list = new ArrayList();

    @Override
    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}
