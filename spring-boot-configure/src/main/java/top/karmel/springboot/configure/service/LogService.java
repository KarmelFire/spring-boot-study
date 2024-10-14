package top.karmel.springboot.configure.service;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName LogService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 17:11
 * @Version 1.0
 */
@Service
public class LogService {
    @Value("${custom.log.level}")
    private String logLevel;
    private final Log log = LogFactory.get();
    public void logMessage(){
        log.info("当前日志级别为：" + logLevel);
        if ("DEBUG".equalsIgnoreCase(logLevel)){
            log.debug("这是测试信息");
        } else if ("INFO".equalsIgnoreCase(logLevel))
        {
            log.info("这是普通信息");
        }
    }
}
