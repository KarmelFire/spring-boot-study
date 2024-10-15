package top.karmel.springboot.exception.controller;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.exception.entity.User;
import top.karmel.springboot.exception.result.Result;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 14:25
 * @Version 1.0
 */
@RestController
public class UserController {
    @PostMapping("/user/add")
    public Result<?> addUser(@Valid @RequestBody User user, BindingResult
            bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        return Result.ok(user);
    }
}