package top.karmel.zhihu.api.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.karmel.zhihu.api.entity.Special;
import top.karmel.zhihu.api.mapper.SpecialMapper;
import top.karmel.zhihu.api.service.SpecialService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName SpecialServiceImpl
 * @Description TODO
 * @Author BC
 * @Date 2024/9/14 19:10
 * @Version 1.0
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    public SpecialMapper specialMapper;

    @Override
    public List<Special> getAll() {
        List<Special> specials = specialMapper.selectAll();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        specials.forEach(special->{
            String format = df.format(new Date(Long.parseLong(special.getUpdated() + "000")));
            special.setUpdated(format);
        });
        return specials;
    }

    @Override
    public List<Special> getByPage(int limit, int offset) {
        return specialMapper.selectByPage(limit, offset);
    }
}
