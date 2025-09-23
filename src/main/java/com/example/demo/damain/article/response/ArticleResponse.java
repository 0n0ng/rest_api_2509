package com.example.demo.damain.article.response;

import com.example.demo.damain.article.dto.ArticleDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleResponse {
    private final ArticleDTO article;
}