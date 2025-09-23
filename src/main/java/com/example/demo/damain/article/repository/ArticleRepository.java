package com.example.demo.damain.article.repository;


import com.example.demo.damain.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Long> {
}
