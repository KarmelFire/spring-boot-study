package top.karmel.springboot.mp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.mp.entity.Clazz;
import top.karmel.springboot.mp.service.ClazzService;

/**
 * @ClassName ClazzController
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 16:04
 * @Version 1.0
 */
@RestController
@RequestMapping("/clazz")
@AllArgsConstructor
public class ClazzController {
    private final ClazzService clazzService;
    /**
     * 获取班级和对应⽼师信息
     */
    @GetMapping("/{id}")
    public Clazz getClazzWithTeacher(@PathVariable Long id) {
        return clazzService.getClazzWithTeacher(id);
    }
}

