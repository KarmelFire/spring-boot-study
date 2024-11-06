package top.karmel.springboot.redis.utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName CommonUtils
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 14:54
 * @Version 1.0
 */
public class CommonUtils {
    public static int generateCode() {
        return ThreadLocalRandom.current().nextInt(1000, 9999);
    }
}
