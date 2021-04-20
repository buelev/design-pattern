package com.buelev.design.uml.component;

/**
 * description: Leaf
 * date: 2021-04-20 19:40
 * author: buelev
 * version: 1.0
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点（设备）不能挂载设备");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点（设备）不能移除设备");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("*");
        }
        System.out.println(getName());
    }
}
