package top.karmel.springboot.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 14:21
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"top.karmel.springboot.mp.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
