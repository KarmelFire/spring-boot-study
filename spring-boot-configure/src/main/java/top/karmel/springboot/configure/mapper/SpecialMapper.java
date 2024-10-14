package top.karmel.springboot.configure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.karmel.springboot.configure.entity.Special;

import java.util.List;

/**
 * @ClassName SpecialMapper
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 16:12
 * @Version 1.0
 */
@Mapper
public interface SpecialMapper {

    @Select("SELECT * FROM LIST ORDER BY updated DESC ")
    List<Special> findAll();
}
