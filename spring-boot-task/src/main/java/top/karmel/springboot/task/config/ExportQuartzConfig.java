package top.karmel.springboot.task.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.karmel.springboot.task.jobs.ExportJob;
import top.karmel.springboot.task.jobs.SimpleQuartzTask;

/**
 * @ClassName SimpleQuartzConfig
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 16:02
 * @Version 1.0
 */
@Configuration
public class ExportQuartzConfig {
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(ExportJob.class)
                .withIdentity("exportTask")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger trigger() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/20 * * * * ?");

        return TriggerBuilder.newTrigger().forJob(jobDetail())
                .withIdentity("exportTask")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
