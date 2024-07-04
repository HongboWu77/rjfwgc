package com.wentun.rjfw.gateway.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class GatewaySentinelConfig {

    public GatewaySentinelConfig() {
        GatewayCallbackManager.setBlockHandler(new BlockRequestHandler() {
            //网关限流了请求，就会调用此回调
            @Override
            public Mono<ServerResponse> handleRequest(ServerWebExchange exchange, Throwable t) {
                CommonResult error = new CommonResult("10001", "网关限流");
                Mono<ServerResponse> body = ServerResponse.ok().body(Mono.just(error.toString()), String.class);
                return body;
            }
        });
    }

    @Data
    @AllArgsConstructor
    static class CommonResult{
        private String code;
        private String message;
    }

}
