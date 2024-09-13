package top.karmel.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName MessageController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/9 14:35
 * @Version 1.0
 */
@Controller
public class MessageController {
    @GetMapping("/msg")
    public String getMsg(Model model) {
        // 将 “message” 属性传到视图
        model.addAttribute("message", "Hello,Thymeleaf!");
        // 返回的视图名称：默认在 resources/templates/msg.html
        return "msg";
    }
}
