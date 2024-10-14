package top.karmel.springboot.configure.controller;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.configure.entity.User;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 14:46
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public String save(@Valid @RequestBody User user) {
        return "SUCCESS";
    }

}
