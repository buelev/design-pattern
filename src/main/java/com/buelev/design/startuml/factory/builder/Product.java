package com.buelev.design.startuml.factory.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: Product
 * date: 2021-03-10 15:00
 * author: buelev
 * version: 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String ground;
    private String cement;
    private String roof;
}
