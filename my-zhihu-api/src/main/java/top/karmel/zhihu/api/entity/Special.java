package top.karmel.zhihu.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Special
 * @Description TODO
 * @Author BC
 * @Date 2024/9/14 16:20
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Special {
    private String id;
    private String title;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private String isFollowing;
    private String introduction;
    private String updated;
}
