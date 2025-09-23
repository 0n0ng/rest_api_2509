package com.example.demo.damain.article.dto;

import com.example.demo.damain.article.entity.Article;
import lombok.Getter;

import java.time.LocalDateTime;

// 순수 데이터 전달용
// 다른 어노테이션 필요x
// 암호같은 정보 제외한 꼭 필요한 데이터만 dto에 담아야함
@Getter
public class ArticleDTO {
    private final Long id;
    private final String subject;
    private final String content;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;

    public ArticleDTO(Article article) {
        this.id = article.getId();
        this.subject = article.getSubject();
        this.content = article.getContent();
        this.createdDate = article.getCreatedDate();
        this.modifiedDate = article.getModifiedDate();
    }
}
