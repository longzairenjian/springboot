package com.lagou.classwork.service;

import com.lagou.classwork.model.Article;
import com.lagou.classwork.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author joker
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> findAll(Integer start, Integer pageSize){
        Pageable pageable = PageRequest.of(start, pageSize);
        return articleRepository.findAll(pageable);
    }
}
