package top.karmel.springboot.configure.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Server
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 14:08
 * @Version 1.0
 */
@Data
@Component
public class Server {
    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private int port;

    @Value("${server.context-path}")
    private String contextPath;
}
