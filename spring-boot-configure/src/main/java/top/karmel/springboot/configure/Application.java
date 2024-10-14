package top.karmel.springboot.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName Application
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 13:42
 * @Version 1.0
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
