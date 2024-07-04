package com.wentun.rjfw.consumer01.service.Impl;

import com.wentun.rjfw.consumer01.service.Consumer01Service;
import com.wentun.rjfw.developer02api.api.Developer02Client;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.wentun.rjfw.developer01api.api.Developer01Client;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Service
@AllArgsConstructor
public class Consumer01ServiceImpl implements Consumer01Service {

    private final Developer01Client developer01Client;

    private final Developer02Client developer02Client;

    @Override
    public String consumer01TestDeveloper01() {
        return developer01Client.developer01Test();
    }

    @Override
    public String consumer01TestDeveloper02() {
        return developer02Client.developer02Test();
    }
}
