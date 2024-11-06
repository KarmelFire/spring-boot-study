package top.karmel.springboot.redis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.redis.result.Result;
import top.karmel.springboot.redis.service.SmsService;

/**
 * @ClassName SmsController
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 15:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/sms")
@AllArgsConstructor
public class SmsController {

    private final SmsService smsService;

    @PostMapping("/send")
    public Result<Object> sendSms(@RequestParam("phone") String phone) {
        smsService.sendSms(phone);
        return Result.ok();
    }
}