package top.karmel.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description TODO
 * @Author BC
 * @Date 2024/9/14 14:57
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"top.karmel.zhihu.api.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
