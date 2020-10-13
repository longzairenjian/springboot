package com.lagou.classwork.controller;

import com.lagou.classwork.model.Article;
import com.lagou.classwork.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author joker
 */
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/login")
    public String index(Integer startPage, Model model){
        if (startPage == null){
            startPage = 0;
        }
        Page<Article> articlePage = articleService.findAll(startPage, 3);
        model.addAttribute("results", articlePage);
        return "client/index";
    }
}
