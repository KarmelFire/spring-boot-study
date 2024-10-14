package top.karmel.springboot.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 15:57
 * @Version 1.0
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Long clazzId;
    // ⽤于⼀对多映射
    @TableField(exist = false)
    private List<Course> courses;
}
