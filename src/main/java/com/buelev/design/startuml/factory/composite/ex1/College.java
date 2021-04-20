package com.buelev.design.startuml.factory.composite.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * description: College
 * date: 2021-03-12 16:39
 * author: buelev
 * version: 1.0
 */
public class College extends OrganizationComponent {
    private List<OrganizationComponent> orgs = new ArrayList();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent component) {
        orgs.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        orgs.remove(component);
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
        System.out.println("=============" + this.getName() + "==============");
        for (OrganizationComponent organizationComponent : orgs) {
            organizationComponent.print();
        }
    }
}
