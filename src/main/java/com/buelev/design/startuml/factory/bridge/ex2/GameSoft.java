package com.buelev.design.startuml.factory.bridge.ex2;

/**
 * description: GameSoft
 * date: 2021-03-11 15:39
 * author: buelev
 * version: 1.0
 */
public class GameSoft implements SoftImplementor{
    @Override
    public void rawrun() {
        System.out.println("GameSoft rawrun...");
    }
}
