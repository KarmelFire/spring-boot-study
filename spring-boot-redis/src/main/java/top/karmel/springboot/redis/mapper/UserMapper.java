package top.karmel.springboot.redis.mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 22:32
 * @Version 1.0
 */
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.karmel.springboot.redis.entity.User;
public interface UserMapper extends BaseMapper<User> {

    default User getByPhone(String phone){
        return this.selectOne(new LambdaQueryWrapper<User>().eq(User::getPhone, phone));
    }
}
