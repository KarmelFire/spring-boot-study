package top.karmel.springboot.filter_interceptor.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.karmel.springboot.filter_interceptor.filter.AuthFilter;
import top.karmel.springboot.filter_interceptor.filter.RateLimitFilter;
import top.karmel.springboot.filter_interceptor.interceptor.AuthInterceptor;
import top.karmel.springboot.filter_interceptor.interceptor.CorsInterceptor;
import top.karmel.springboot.filter_interceptor.interceptor.LoggingInterceptor;
import top.karmel.springboot.filter_interceptor.interceptor.UploadInterceptor;

/**
 * @ClassName InterceptorConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/11/4 14:53
 * @Version 1.0
 */
@Configuration
@AllArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    private final LoggingInterceptor loggingInterceptor;
    private final AuthInterceptor authInterceptor;
    private final CorsInterceptor corsInterceptor;
    private final UploadInterceptor uploadInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加了拦截器，并添加拦截地址
        registry.addInterceptor(loggingInterceptor).addPathPatterns("/**");
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");
        registry.addInterceptor(corsInterceptor).addPathPatterns("/**");
        registry.addInterceptor(uploadInterceptor).addPathPatterns("/**");
    }
}
