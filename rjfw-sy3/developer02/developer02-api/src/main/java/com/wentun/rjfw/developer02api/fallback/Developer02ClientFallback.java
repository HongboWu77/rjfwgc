package com.wentun.rjfw.developer02api.fallback;

import com.wentun.rjfw.developer02api.api.Developer02Client;

/**
 * @author xiaobai
 * @create 2024-07-04-
 */
public class Developer02ClientFallback implements Developer02Client {
    @Override
    public String developer02Test() {
        return "服务发生断路";
    }
}
