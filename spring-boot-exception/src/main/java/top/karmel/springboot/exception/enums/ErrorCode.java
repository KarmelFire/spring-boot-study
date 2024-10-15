package top.karmel.springboot.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ErrorCode
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 13:52
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHORIZED(401, "登录失效，请重新登录"),
    INTERNAL_SERVER_ERROR(500, " 服务器异常，请稍后再试 ");
    private final int code;
    private final String msg;
}