package top.karmel.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.karmel.springboot.thymeleaf.model.Task;
import top.karmel.springboot.thymeleaf.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/9 15:51
 * @Version 1.0
 */
@Controller
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/userList")
    private String userList(Model model) {
        model.addAttribute("users", users);
        return "userList";
    }

    @PostMapping("/addUser")
    private String addUser(String name, String email) {
        Long id = (long) (users.size() + 1);
        User user = new User(id, name, email);
        users.add(user);
        return "redirect:userList";
    }
}
