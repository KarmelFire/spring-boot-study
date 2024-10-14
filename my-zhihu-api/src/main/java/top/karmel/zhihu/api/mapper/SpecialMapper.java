package top.karmel.zhihu.api.mapper;

import top.karmel.zhihu.api.entity.Special;

import java.util.List;

/**
 * @ClassName SpecialMapper
 * @Description TODO
 * @Author BC
 * @Date 2024/9/14 16:33
 * @Version 1.0
 */
public interface SpecialMapper {
    List<Special> selectAll();
    List<Special> selectByPage(int limit, int offset);
}
