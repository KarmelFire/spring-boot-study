package top.karmel.springboot.task.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import top.karmel.springboot.task.entity.EmailLog;
import top.karmel.springboot.task.mapper.EmailLogMapper;

import java.time.LocalDateTime;

/**
 * @ClassName MailService
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 15:37
 * @Version 1.0
 */
@Service
@AllArgsConstructor
@Slf4j
public class MailService {
    private final JavaMailSender mailSender;
    private final EmailLogMapper emailLogMapper;

    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1716284841@qq.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        EmailLog emailLog = new EmailLog();
        emailLog.setRecipient(to);
        emailLog.setSubject(subject);
        emailLog.setContent(content);
        emailLog.setSentAt(LocalDateTime.now());
        emailLogMapper.insert(emailLog);

        log.info("邮件已发送至：{}", to);
    }
}
