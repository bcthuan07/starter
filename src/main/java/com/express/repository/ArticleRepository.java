package com.express.repository;

import org.springframework.data.repository.CrudRepository;

import com.express.domain.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
