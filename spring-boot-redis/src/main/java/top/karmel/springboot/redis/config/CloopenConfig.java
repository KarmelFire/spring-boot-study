package top.karmel.springboot.redis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CloopenConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 14:57
 * @Version 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "karmel.sms.ccp")
public class CloopenConfig {
    private String serverIp = "app.cloopen.com";
    private String port = "8883";
    private String accountSId = "2c94811c8cd4da0a018f2531057675e6";
    private String accountToken = "0bcfc0cb04d940fc9ccaa61145eb59cd";
    private String appId = "2c94811c8cd4da0a018f2531071575ed";
    private String templateId = "1";
}
