package top.karmel.springboot.configure.entity;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 23:19
 * @Version 1.0
 */
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    @Value("${student.dog.name}")
    private String name;

    @Value("${student.dog.age}")
    private Integer age;
}