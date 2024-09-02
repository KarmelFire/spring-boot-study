package top.karmel.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.quickstart.entity.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:42
 * @Version 1.0
 */
@Service
public class UserService {

    private final List<User> users = List.of(
            new User(1L, "张三", 22),
            new User(2L, "张三", 22),
            new User(3L, "张三", 22)
    );

    public List<String> getAdultsUserName() {
        return users.stream()
                .filter(user -> user.getAge() > 18)
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
