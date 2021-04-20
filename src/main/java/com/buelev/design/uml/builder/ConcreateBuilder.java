package com.buelev.design.uml.builder;

/**
 * description: ConcreateBuilder
 * date: 2021-04-16 15:03
 * author: buelev
 * version: 1.0
 */
public class ConcreateBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildGround() {
        System.out.println("build地基");
        product.setGround("build地基");
    }

    @Override
    public void buildCement() {
        System.out.println("build水泥地");
        product.setCement("build水泥地");
    }

    @Override
    public void buildRoof() {
        System.out.println("build楼顶");
        product.setRoof("build楼顶");
    }

    @Override
    public Product product() {
        System.out.println("建造完毕");
        return product;
    }
}
