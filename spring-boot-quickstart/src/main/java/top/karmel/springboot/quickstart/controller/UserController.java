package top.karmel.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.quickstart.service.UserService;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:46
 * @Version 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/adults")
    public List<String> getAdultsUserName() {
        return userService.getAdultsUserName();
    }
}
