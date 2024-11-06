package top.karmel.springboot.task.timer;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName StockPriceTimer
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 14:22
 * @Version 1.0
 */
@Slf4j
public class StockPriceTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            double price = 100.0;
            final Random random = new Random();
            @Override
            public void run() {
                price += (random.nextDouble() - 0.5) * 2;
                log.info("当前的股票价格是: {} ", price);
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
