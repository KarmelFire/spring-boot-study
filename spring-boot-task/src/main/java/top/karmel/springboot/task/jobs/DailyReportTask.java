package top.karmel.springboot.task.jobs;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.karmel.springboot.task.service.MailService;

import java.time.LocalDateTime;

/**
 * @ClassName DailyReportTask
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 15:41
 * @Version 1.0
 */
//@Component
@AllArgsConstructor
@Slf4j
public class DailyReportTask {
    private final MailService mailService;

    @Scheduled(cron = "0 59 15 * * ?")
    public void sendReport() {
        String report = "这是每日数据报表的内容";
        mailService.sendMail("1716284841@qq.com", "每日数据报表", "测试测试测试测试测试测试测试测试测试测试测试");
        log.info("报表已生成并发送邮件{}", LocalDateTime.now());
    }
}
