package top.karmel.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.configure.entity.Mail;
import top.karmel.springboot.configure.service.EmailService;

/**
 * @ClassName EmailController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/24 10:25
 * @Version 1.0
 */
@RestController
@AllArgsConstructor
public class EmailController {
    private EmailService emailService;

    @PostMapping("/mail")
    public void sendEmail(@RequestBody Mail mail) {
        emailService.sendSimpleMail(mail.getTo(), mail.getSubject(), mail.getBody());
    }
}
