package com.buelev.design.clone;

import java.util.Date;

/**
 * description: Pig
 * date: 2020-06-05 01:07
 * author: buelev
 * version: 1.0
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
