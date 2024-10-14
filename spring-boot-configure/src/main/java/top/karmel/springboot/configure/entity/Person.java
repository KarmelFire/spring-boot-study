package top.karmel.springboot.configure.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @ClassName Person
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 14:39
 * @Version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String id;
    private String phone;
}
