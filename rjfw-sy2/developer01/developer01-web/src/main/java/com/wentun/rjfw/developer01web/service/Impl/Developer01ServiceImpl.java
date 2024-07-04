package com.wentun.rjfw.developer01web.service.Impl;

import com.wentun.rjfw.developer01web.service.Developer01Service;
import org.springframework.stereotype.Service;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Service
public class Developer01ServiceImpl implements Developer01Service {

    @Override
    public String developer01Test() {
        return "Developer01";
    }
}
