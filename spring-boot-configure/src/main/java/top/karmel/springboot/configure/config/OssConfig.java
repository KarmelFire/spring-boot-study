package top.karmel.springboot.configure.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName OssConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 16:05
 * @Version 1.0
 */
@Data
@Configuration
public class OssConfig {
    @Value("${aliyun.oss.endpoint}")
    private String endpoint;
    @Value("${aliyun.oss.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.oss.accessKeySecret}")
    private String accessKeySecret;
    @Value("${aliyun.oss.bucketName}")
    private String bucketName;
    @Bean
    public OSS ossClient(){
        return new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
    }
}