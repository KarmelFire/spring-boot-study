package top.karmel.springboot.task.jobs;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.karmel.springboot.task.entity.StockPrive;
import top.karmel.springboot.task.mapper.StockPriveMapper;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @ClassName StockPriceTask
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 14:59
 * @Version 1.0
 */
//@Component
@AllArgsConstructor
public class StockPriceTask {
    private static final Logger log = LoggerFactory.getLogger(StockPriceTask.class);
    private final StockPriveMapper stockPriveMapper;
    private final Random random = new Random();


    @Scheduled(fixedRate = 10000)
    public void updateStockPrice() {
        double price = 100 + random.nextDouble() * 50;
        StockPrive stockPrive = new StockPrive();

        stockPrive.setPrice(formatDouble(price));
        stockPrive.setName("小米");
        stockPrive.setUpdateTime(LocalDateTime.now());

        stockPriveMapper.insert(stockPrive);
        log.info("股票价格已更新: {}, 时间: {}", price, LocalDateTime.now());


    }

    public static double formatDouble(double d) {
        return (double)Math.round(d*100)/100;
    }
}
