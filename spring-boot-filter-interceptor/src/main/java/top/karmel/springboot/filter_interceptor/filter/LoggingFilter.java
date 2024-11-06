package top.karmel.springboot.filter_interceptor.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @ClassName LoggingFilter
 * @Description TODO
 * @Author BC
 * @Date 2024/11/4 13:52
 * @Version 1.0
 */
@Slf4j
public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("LoggingFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // 请求资源的路径
        String path = request.getRequestURI();
        // 请求的客户端地址
        String clientIp = request.getRemoteAddr();
        // 请求的开始时间
        LocalDateTime beginTime = LocalDateTime.now();
        log.info("请求已经到达过滤器：path：{}，clienIp={},beginTime={}",path,clientIp,beginTime);
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("过滤器处理完毕：path：{}",path);
    }

    @Override
    public void destroy() {
        log.info("LoggingFilter 销毁");
    }
}
