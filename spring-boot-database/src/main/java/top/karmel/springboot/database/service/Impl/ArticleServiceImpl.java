package top.karmel.springboot.database.service.Impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.karmel.springboot.database.entity.Article;
import top.karmel.springboot.database.repository.ArticleRepository;
import top.karmel.springboot.database.service.ArticleService;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @Author BC
 * @Date 2024/10/8 14:24
 * @Version 1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleRepository articleRepository;
    @Override
    public Article saveArticle(Article article) {
        articleRepository.save(article);
        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article getArticle(Long id) {
        Optional<Article> optionalArticle = articleRepository.findById(id);
        return optionalArticle.orElse(null);
    }

    @Override
    public List<Article> getAll() {
        return List.of();
    }
}
