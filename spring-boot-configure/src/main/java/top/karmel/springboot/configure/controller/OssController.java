package top.karmel.springboot.configure.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.karmel.springboot.configure.util.OssUtil;

import java.util.HashMap;
import java.util.Map;

import static cn.hutool.core.lang.Console.log;

/**
 * @ClassName OssController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 16:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/oss")
public class OssController {
    @Resource
    private OssUtil ossUtil;
    @PostMapping("/upload")
    public Map<String,Object> uploadFile(@RequestParam("file") MultipartFile file){
        String fileUrl = ossUtil.uploadFile(file);
        Map<String,Object> response = new HashMap<>();
        response.put("fileUrl",fileUrl);
        return response;
    }
}