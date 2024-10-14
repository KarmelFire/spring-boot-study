package top.karmel.springboot.database.mapper;

import top.karmel.springboot.database.entity.Clazz;

public interface ClazzMapper {
    Clazz getClazzById(int clazzId);
    Clazz getClazz(int clazzId);
}
