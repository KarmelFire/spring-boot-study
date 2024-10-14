package top.karmel.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.configure.service.ConfigBackupService;

/**
 * @ClassName ConfigBackupController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 17:15
 * @Version 1.0
 */
@RestController
@AllArgsConstructor
public class ConfigBackupController {
    private final ConfigBackupService configBackupService;
    @GetMapping("/backup")
    public void backupConfig(){
        configBackupService.backupConfigFile();
    }
}

