package com.wentun.rjfw.consumer02.service.Impl;

import com.wentun.rjfw.consumer02.service.Consumer02Service;
import com.wentun.rjfw.developer01api.api.Developer01Client;
import com.wentun.rjfw.developer02api.api.Developer02Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Service
@AllArgsConstructor
public class Consumer02ServiceImpl implements Consumer02Service {

    private final Developer01Client developer01Client;

    private final Developer02Client developer02Client;

    @Override
    public String consumer02TestDeveloper01() {
        return developer01Client.developer01Test();
    }

    @Override
    public String consumer02TestDeveloper02() {
        return developer02Client.developer02Test();
    }
}
