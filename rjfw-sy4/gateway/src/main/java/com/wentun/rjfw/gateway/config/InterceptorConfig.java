package com.wentun.rjfw.gateway.config;

import com.wentun.rjfw.gateway.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xiaobai
 * @create 2023-11-24-
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        String[] swaggerExcludes = new String[]{
                "/**/webjars/**",
                "/**/swagger-ui/**",
                "/**/swagger-resources/**",
                "/v3/api-docs"};
        registry.addInterceptor(jwtInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/**/getUserByIdByPass",
                        "/**/saveUser",
                        "/**/sendCode",
                        "/**/getUserByContactInformation",
                        "/**/listBusinessByOrderTypeId",
                        "/**/getBusinessById",
                        "/**/listFoodByBusinessId",
                        "/swagger-ui/index.html"
                ).excludePathPatterns(swaggerExcludes);
        //WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public JwtInterceptor jwtInterceptor(){
        return new JwtInterceptor();
    }
}
