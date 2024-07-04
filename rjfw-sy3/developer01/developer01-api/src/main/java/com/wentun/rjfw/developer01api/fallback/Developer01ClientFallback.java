package com.wentun.rjfw.developer01api.fallback;

import com.wentun.rjfw.developer01api.api.Developer01Client;

/**
 * @author xiaobai
 * @create 2024-07-04-
 */
public class Developer01ClientFallback implements Developer01Client {

    @Override
    public String developer01Test() {
        return "服务发生断路";
    }
}
