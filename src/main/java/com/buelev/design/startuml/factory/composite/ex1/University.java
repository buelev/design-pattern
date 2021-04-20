package com.buelev.design.startuml.factory.composite.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * description: University
 * date: 2021-03-12 15:59
 * author: buelev
 * version: 1.0
 */
public class University extends OrganizationComponent {

    private List<OrganizationComponent> list = new ArrayList();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent component) {
        list.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        list.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("=============" + super.getName() + "==============");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }
}
