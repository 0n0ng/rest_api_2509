package com.example.demo.global.initData;

import com.example.demo.damain.article.service.ArticleService;
import com.example.demo.damain.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //
public class Init {

    // 스프링 실행 직후 자동 실행되는 인터페이스, 테스트로 많이 사용된다.
    @Bean
    CommandLineRunner initData(ArticleService articleService, MemberService memberService) {
        return args -> {
            memberService.join("admin", "1234");
            memberService.join("user1", "1234");
            memberService.join("user2", "1234");
            memberService.join("user3", "1234");
            memberService.join("user4", "1234");
            memberService.join("user5", "1234");

            articleService.write("제목1", "내용1");
            articleService.write("제목2", "내용2");
            articleService.write("제목3", "내용3");
            articleService.write("제목4", "내용4");
            articleService.write("제목5", "내용5");
            articleService.write("제목6", "내용6");
        };
    }
}
