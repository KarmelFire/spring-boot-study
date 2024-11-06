package top.karmel.springboot.filter_interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import top.karmel.springboot.filter_interceptor.config.OssConfig;

/**
 * @ClassName Application
 * @Description TODO
 * @Author BC
 * @Date 2024/10/8 14:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigurationProperties(OssConfig.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
