package top.karmel.springboot.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

/**
 * @ClassName Application
 * @Description TODO
 * @Author BC
 * @Date 2024/10/8 14:16
 * @Version 1.0
 */
@Service
@SpringBootApplication
@MapperScan(basePackages = {"top.karmel.springboot.database.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

