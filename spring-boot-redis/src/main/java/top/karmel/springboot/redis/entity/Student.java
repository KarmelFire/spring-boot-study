package top.karmel.springboot.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 14:15
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = -185208380647051549L;

    private String id;
    private String name;
    private Address address;
}
