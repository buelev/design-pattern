package com.buelev.design.startuml.factory.builder;

/**
 * description: Client
 * date: 2021-03-10 15:16
 * author: buelev
 * version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        DiretcProduct diretcProduct = new DiretcProduct(productBuilder);
        Product product = diretcProduct.build();
        System.out.println(product);

    }
}
