package com.example.demo.damain.article.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data // 웬만한 게터 세터 포함 모두 사용 가능함 (종합선물세트)
public class ArticleModifyRequest {
    @NotBlank
    private String subject;

    @NotBlank
    private String content;
}
