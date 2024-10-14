package top.karmel.springboot.configure.service;

import cn.hutool.core.io.FileUtil;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @ClassName ConfigBackService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 17:14
 * @Version 1.0
 */
@Service
@Slf4j
public class ConfigBackupService {
    @Value("${custom.backup.location}")
    private String configFilePath;
    @PostConstruct
    public void backupConfigFile(){
        File configFile = new File(configFilePath);
        if (configFile.exists()){
            File backupFile = new File("backup/" + configFile.getName());
            FileUtil.copy(configFile,backupFile,true);
            log.info("配置文件已备份到：{}",backupFile.getPath());
        }
    }
}