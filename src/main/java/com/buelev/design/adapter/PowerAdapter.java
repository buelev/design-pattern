package com.buelev.design.adapter;

import com.buelev.design.adapter.AC220;
import com.buelev.design.adapter.DC5;

/**
 * description: PowerAdapter
 * date: 2020-06-12 00:37
 * author: buelev
 * version: 1.0
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220v = new AC220();

    @Override
    public int outputDC5V() {
        int dc5v = ac220v.outputAC220V() / 44;
        System.out.println("使用PowerAdapter输入AC:" + ac220v + "V" + "输出DC:" + dc5v + "V");

        return dc5v;
    }
}
