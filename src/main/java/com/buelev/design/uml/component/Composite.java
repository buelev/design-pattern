package com.buelev.design.uml.component;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Composite
 * date: 2021-04-20 19:42
 * author: buelev
 * version: 1.0
 */
public class Composite extends Component {
    public Composite(String name) {
        super(name);
    }

    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("*");
        }
        System.out.println(getName());
        for (Component component : list) {
            component.display(depth + 1);
        }
    }
}
