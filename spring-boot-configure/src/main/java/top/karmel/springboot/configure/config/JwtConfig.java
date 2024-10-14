package top.karmel.springboot.configure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName JwtConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 16:19
 * @Version 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    private String secret;
    private Long expiration;
}
