package com.lagou.classwork.repository;

import com.lagou.classwork.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author joker
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
