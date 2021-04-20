package com.buelev.design.startuml.factory.decorator.ex1;

import lombok.Data;

/**
 * description: Drink
 * date: 2021-03-11 16:23
 * author: buelev
 * version: 1.0
 */
@Data
public abstract class Drink {
    private String desc;//描述
    private float price;//价格

    public String getDesc() {
        return desc;
    }

    public float getPrice() {
        return price;
    }

    public abstract float cost();//总价

}
