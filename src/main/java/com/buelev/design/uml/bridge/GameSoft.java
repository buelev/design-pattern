package com.buelev.design.uml.bridge;

/**
 * description: GameSoft
 * date: 2021-04-16 17:36
 * author: buelev
 * version: 1.0
 */
public class GameSoft implements SoftImplementor{
    @Override
    public void rawrun() {
        System.out.println("GameSoft rawrun...");
    }
}
