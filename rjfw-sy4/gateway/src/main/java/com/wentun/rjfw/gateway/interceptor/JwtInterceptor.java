package com.wentun.rjfw.gateway.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * @author xiaobai
 * @create 2023-11-24-
 */
public class JwtInterceptor implements HandlerInterceptor {
    private static final String AUTH_HEADER = "Authorization";
    private static final String TOKEN_PREFIX = "Bearer ";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String authHeader = request.getHeader(AUTH_HEADER);

        if (authHeader == null || !authHeader.startsWith(TOKEN_PREFIX)) {
            // 如果没有Authorization头或者格式不正确，返回未授权状态码
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }

        String token = authHeader.substring(TOKEN_PREFIX.length());

        if(token==null) return false;

         // 令牌验证通过，继续处理请求
         return true;
    }
}
