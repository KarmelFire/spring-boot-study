package top.karmel.springboot.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @ClassName Clazz
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 15:56
 * @Version 1.0
 */
@Data
public class Clazz {
    private Long id;
    private String name;
    private Long teacherId;
    // ⽤于⼀对⼀映射
    @TableField(exist = false)
    private Teacher teacher;
}
