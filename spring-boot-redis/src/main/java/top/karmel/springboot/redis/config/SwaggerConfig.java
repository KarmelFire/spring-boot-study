package top.karmel.springboot.redis.config;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 22:18
 * @Version 1.0
 */
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("karmel 的 API")
                        .contact(new Contact().name("karmel").email("1716284841.@qq.com"))
                .version("1.0")
                .description("karmel 的 API 接⼝⽂档")
                .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com")));
    }
}