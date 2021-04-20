package com.buelev.design.uml.bridge;

/**
 * description: ChatSoft
 * date: 2021-04-16 17:37
 * author: buelev
 * version: 1.0
 */
public class ChatSoft implements SoftImplementor{
    @Override
    public void rawrun() {
        System.out.println("chatsoft rawrun....");
    }
}
