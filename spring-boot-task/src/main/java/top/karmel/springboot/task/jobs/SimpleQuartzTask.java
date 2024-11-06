package top.karmel.springboot.task.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;

/**
 * @ClassName SimpleQuartzTask
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 16:00
 * @Version 1.0
 */
@Slf4j
public class SimpleQuartzTask extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("SimpleQuartzTask executing... {}", LocalDateTime.now());
    }
}

