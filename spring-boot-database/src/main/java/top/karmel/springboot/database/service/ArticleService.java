package top.karmel.springboot.database.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.database.entity.Article;

import java.util.List;

/**
 * @author BC
 */

public interface ArticleService {
    Article saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}
