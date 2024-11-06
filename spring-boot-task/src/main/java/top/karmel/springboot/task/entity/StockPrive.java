package top.karmel.springboot.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName StockPrive
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 14:55
 * @Version 1.0
 */
@Data
@TableName("stock_price")
public class StockPrive {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private LocalDateTime updateTime;
}
