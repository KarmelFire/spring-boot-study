package top.karmel.springboot.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Article
 * @Description TODO
 * @Author BC
 * @Date 2024/10/8 14:19
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 32)
    private String author;

    @Column(nullable = false, unique = true, length = 32)
    private String title;

    @Column(length = 512)
    private String content;
}
