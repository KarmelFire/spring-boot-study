package top.karmel.springboot.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.karmel.springboot.database.entity.Course;
import top.karmel.springboot.database.entity.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void getStudentInfor() {
        Course course = courseMapper.getStudentInfor(20001);
        log.info("课程名称: {}", course.getCourseName());
        log.info("选修该课程学生信息如下:");
        List<Student> students = course.getStudents();
        students.forEach(student -> log.info("{}, {}", student.getStudentName(), student.getHometown()));

    }
}