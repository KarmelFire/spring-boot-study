package top.karmel.springboot.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.karmel.springboot.database.entity.Article;


/**
 * @author BC
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
