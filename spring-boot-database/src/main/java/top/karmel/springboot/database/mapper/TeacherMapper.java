package top.karmel.springboot.database.mapper;

import top.karmel.springboot.database.entity.Teacher;

public interface TeacherMapper {
    Teacher findTeacherById(int teacherId);
}
