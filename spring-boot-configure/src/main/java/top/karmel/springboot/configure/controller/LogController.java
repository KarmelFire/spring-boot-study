package top.karmel.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.configure.service.LogService;

/**
 * @ClassName LogController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 17:11
 * @Version 1.0
 */
@RestController
@AllArgsConstructor
public class LogController {
    private final LogService logService;
    @GetMapping("/log")
    public void logMsg(){
        logService.logMessage();
    }
}