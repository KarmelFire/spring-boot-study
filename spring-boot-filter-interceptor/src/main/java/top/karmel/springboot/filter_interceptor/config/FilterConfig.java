package top.karmel.springboot.filter_interceptor.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.karmel.springboot.filter_interceptor.filter.*;

/**
 * @ClassName FilterConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/11/4 13:44
 * @Version 1.0
 */
@Configuration
public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean<LoggingFilter> filterRegistrationBean() {
//        FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new LoggingFilter());
//        // 设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
//        // 设置过滤器的执行顺序
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean<AuthFilter> authFilter() {
//        FilterRegistrationBean<AuthFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new AuthFilter());
//        // 设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
//        // 设置过滤器的执行顺序
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean<CorsFilter> corsFilter() {
//        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new CorsFilter());
//        // 设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
//        // 设置过滤器的执行顺序
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean<RateLimitFilter> corsFilter() {
//        FilterRegistrationBean<RateLimitFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new RateLimitFilter());
//        // 设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
//        // 设置过滤器的执行顺序
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

    @Bean
    public FilterRegistrationBean<RateLimitFilter> rateLimitFilter(){
        FilterRegistrationBean<RateLimitFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RateLimitFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(3);
        return registrationBean;
    }
}
