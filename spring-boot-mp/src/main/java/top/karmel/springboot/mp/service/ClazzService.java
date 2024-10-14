package top.karmel.springboot.mp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.karmel.springboot.mp.entity.Clazz;
import top.karmel.springboot.mp.entity.Teacher;
import top.karmel.springboot.mp.mapper.ClazzMapper;

/**
 * @ClassName ClazzService
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 16:01
 * @Version 1.0
 */
@Service
@AllArgsConstructor
public class ClazzService {
    private final ClazzMapper clazzMapper;
    /**
     * 根据班级ID获取班级和对应⽼师
     */
    public Clazz getClazzWithTeacher(Long clazzId) {
        Clazz clazz = clazzMapper.selectById(clazzId);
        if (clazz != null) {
            Teacher teacher = clazzMapper.selectTeacherByClazzId(clazz.getTeacherId());
            clazz.setTeacher(teacher);
        }
        return clazz;
    }
}
