package com.example.demo.damain.article.response;

import com.example.demo.damain.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleModifyResponse {
    private final Article article;
}