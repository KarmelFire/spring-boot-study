package top.karmel.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.quickstart.enums.RequestType;
import top.karmel.springboot.quickstart.service.CustomerService;

/**
 * @ClassName CustomerController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:20
 * @Version 1.0
 */
@RestController
@RequestMapping("/requests")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @GetMapping("{type}")
    public String handleRequest(@PathVariable RequestType type) {
        return customerService.handleRequest(type);
    }
}
