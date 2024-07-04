package com.wentun.rjfw.developer02web.service.Impl;

import com.wentun.rjfw.developer02web.service.Developer02Service;
import org.springframework.stereotype.Service;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Service
public class Developer02ServiceImpl implements Developer02Service {

    @Override
    public String developer02Test() {
        return "Developer02";
    }
}
