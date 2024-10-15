package top.karmel.springboot.exception.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.exception.exception.ServerException;

/**
 * @ClassName ExceptionService
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 14:04
 * @Version 1.0
 */
@Service
public class ExceptionService {
    /**
     *
     模拟未登录异常
     */
    public void unAuthorizedError() {
        throw new ServerException("没有登录");
    }
    /**
     *
     模拟系统异常
     */
    public void systemError() {
        throw new ServerException("系统异常");
    }
}
