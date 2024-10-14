package top.karmel.zhihu.api.service;

import top.karmel.zhihu.api.entity.Special;

import java.util.List;

public interface SpecialService {
    List<Special> getAll();
    List<Special> getByPage(int limit, int offset);

}
