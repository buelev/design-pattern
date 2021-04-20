package com.buelev.design.startuml.factory.composite.ex2;

/**
 * description: Client
 * date: 2021-03-12 17:04
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("综合实验室");
        root.add(new Leaf("综合设备1"));
        root.add(new Leaf("综合设备2"));

        // 创建二级节点及其子节点
        Composite branchLevel21 = new Composite("化学实验室");
        branchLevel21.add(new Leaf("试管"));
        branchLevel21.add(new Leaf("烧杯"));
        branchLevel21.add(new Leaf("锥形瓶"));
        root.add(branchLevel21);

        Composite branchLevel22 = new Composite("物理实验室");
        branchLevel22.add(new Leaf("单刀单至开关设备"));
        branchLevel22.add(new Leaf("电磁箱"));

        Composite branchLevel221 = new Composite("精密仪器实验组");
        branchLevel221.add(new Leaf("精密光学测量仪"));
        branchLevel221.add(new Leaf("精密机床"));
        branchLevel22.add(branchLevel221);
        root.add(branchLevel22);

        root.print();
    }
}
