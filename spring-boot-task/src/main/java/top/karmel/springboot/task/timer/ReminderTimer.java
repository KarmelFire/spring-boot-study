package top.karmel.springboot.task.timer;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName ReminderTimer
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 14:10
 * @Version 1.0
 */
@Slf4j
public class ReminderTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countdown = 10;
            @Override
            public void run() {
                if (countdown > 0) {
                    log.info("倒计时: {} 秒", countdown);
                    countdown--;
                } else {
                    log.info("倒计时结束");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
