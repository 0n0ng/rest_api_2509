package com.example.demo.article.controller;


import com.example.demo.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
// view형태 아닌 json형태의 데이터를 넘겨주기 때문에 Api라는 이름을 붙여준다.
// 버전 관리하듯 이름을 붙여준다.
//@ResponseBody 가 필요 없다.
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor // 생성자 자동 생성
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public String list(){
        return  "목록";
    }

    @GetMapping("/{id}")
    public String getArticle(){
        return  "단건";
    }
    @PostMapping("")
    public String create(){
        return  "목록";
    }
    @PatchMapping("/{id}")
    public String modify(){
        return  "";
    }
    @DeleteMapping("{id}")
    public String delete(){
        return  "";
    }
}
