package top.karmel.springboot.task.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName ScheduledJobs
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 14:37
 * @Version 1.0
 */
//@Component
@Slf4j
public class ScheduledJobs {

//    @Scheduled(fixedRate = 3000)
//    public void fixedRateJob() throws InterruptedException {
//        log.info("fixedRateJob start:{}", new Date());
//        Thread.sleep(5000);
//        log.info("fixedRateJob end:{}", new Date());
//    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayJob() throws InterruptedException {
//        log.info("fixedDelayJob start:{}", new Date());
//        Thread.sleep(5000);
//        log.info("fixedDelayJob end:{}", new Date());
//    }

    @Scheduled(cron = "0/3 * * * * ? ")
    public void fixedDelayJob() throws InterruptedException {
        log.info("-----cron 执行: {}", new Date());
    }
}
