package top.karmel.springboot.mp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.karmel.springboot.mp.entity.Course;
import top.karmel.springboot.mp.entity.Student;
import top.karmel.springboot.mp.mapper.StudentCourseMapper;
import top.karmel.springboot.mp.mapper.StudentMapper;

import java.util.List;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author BC
 * @Date 2024/10/14 16:03
 * @Version 1.0
 */
@Service
@AllArgsConstructor
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentCourseMapper studentCourseMapper;
    /**
     * 根据学⽣ID获取该学⽣的课程信息
     */
    public Student getStudentWithCourses(Long studentId) {
        Student student = studentMapper.selectById(studentId);
        if (student != null) {
            List<Course> courses = studentCourseMapper.selectCoursesByStudentId(studentId);
            student.setCourses(courses);
        }
        return student;
    }
}
