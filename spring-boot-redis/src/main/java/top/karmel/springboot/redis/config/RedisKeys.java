package top.karmel.springboot.redis.config;

/**
 * @ClassName RedisKey
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 14:52
 * @Version 1.0
 */
public class RedisKeys {
    public static String getSmsKey(String phone) {
        return "sms:captcha" + phone;
    }

    public static String getAccessTokenKey(String accessToken) {
        return "sys:access:" + accessToken;
    }

    public static String getUserIdKey(Long id) {
        return "sys:userId:" + id;
    }
}
