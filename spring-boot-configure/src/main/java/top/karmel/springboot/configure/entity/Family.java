package top.karmel.springboot.configure.entity;

import lombok.Data;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import top.karmel.springboot.configure.loader.YamlPropertyLoader;

/**
 * @ClassName Family
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 13:43
 * @Version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "family")
//@PropertySource(value = {"classpath:family.properties"})
@PropertySource(value = {"classpath:family.yml"}, factory = YamlPropertyLoader.class)
@Validated
public class Family {
    @Length(min = 5, max = 10, message = "家庭名称必须在5到10位之间")
    private String familyName;
    private String father;
    private String mother;
    private String child;

    @Range(min = 3, message = "家庭年龄必须大于3年!")
    private Integer age;
}
