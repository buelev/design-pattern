package com.buelev.design.startuml.factory.builder;

/**
 * description: ProductBuilder
 * date: 2021-03-10 15:10
 * author: buelev
 * version: 1.0
 */
public class ProductBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void productGround() {
        System.out.println("build地基");
        product.setGround("build地基");
    }

    @Override
    public void productCement() {
        System.out.println("build水泥");
        product.setCement("build水泥");
    }

    @Override
    public void productRoof() {
        System.out.println("build楼顶");
        product.setRoof("build楼顶");
    }

    @Override
    public Product buildProduct() {
        System.out.println("建造完毕");
        return product;
    }

}
