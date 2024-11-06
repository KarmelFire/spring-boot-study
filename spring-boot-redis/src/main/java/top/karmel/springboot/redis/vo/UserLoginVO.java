package top.karmel.springboot.redis.vo;

/**
 * @ClassName UserLoginVO
 * @Description TODO
 * @Author BC
 * @Date 2024/10/21 22:26
 * @Version 1.0
 */
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
@Data
@Schema(description = "⽤户登录vo")
public class UserLoginVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8212240698099812005L;
    @Schema(description = "⽤户ID")
    private Long pkId;
    @Schema(description = "⼿机号")
    private String phone;
    @Schema(description = "令牌")
    private String accessToken;
}