package top.karmel.springboot.redis.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.karmel.springboot.redis.enums.ErrorCode;

import java.io.Serial;

/**
 * @ClassName ServerException
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 13:55
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServerException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    public ServerException(String msg) {
        super(msg);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR.getCode();
        this.msg = msg;
    }

    public ServerException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public ServerException(String msg, Throwable e) {
        super(msg, e);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR.getCode();
        this.msg = msg;
    }
}
