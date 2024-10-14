package top.karmel.springboot.configure.util;

import cn.hutool.jwt.JWTUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import top.karmel.springboot.configure.config.JwtConfig;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName JwtUtil
 * @Description TODO
 * @Author BC
 * @Date 2024/9/23 16:20
 * @Version 1.0
 */
@Component
public class JwtUtil {
    @Resource
    private JwtConfig jwtConfig;
    public String generateToken(Map<String, Object> claims){
        claims.put("exp", new Date(System.currentTimeMillis() + jwtConfig.getExpiration()));
        return JWTUtil.createToken(claims,jwtConfig.getSecret().getBytes());
    }
}
