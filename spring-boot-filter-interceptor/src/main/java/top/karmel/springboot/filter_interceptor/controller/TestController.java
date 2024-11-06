package top.karmel.springboot.filter_interceptor.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.karmel.springboot.filter_interceptor.utils.OssUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author BC
 * @Date 2024/11/4 13:47
 * @Version 1.0
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test() {
        return "test";
    }
    @Resource
    private OssUtil ossUtil;

    @PostMapping("upload")
    public Map<String, Object> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileUrl = ossUtil.uploadFile(file);
        Map<String, Object> response = new HashMap<>();
        response.put("fileUrl", fileUrl);
        return response;
    }
}