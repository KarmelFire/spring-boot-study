package top.karmel.springboot.exception.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.exception.service.ExceptionService;

/**
 * @ClassName ExceptionController
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 14:18
 * @Version 1.0
 */
@RestController
public class ExceptionController {
    @Resource
    private ExceptionService exceptionService;
    @GetMapping("/articles/{id}")
    public void getArticle(@PathVariable("id") Integer id) {
        if (id == 1) {
            exceptionService.unAuthorizedError();
        } else {
            exceptionService.systemError();
        }
    }
}