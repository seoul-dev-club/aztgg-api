package com.aztgg.api.techarticle.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechArticleRepository extends JpaRepository<TechArticle, Long> {

    Page<TechArticle> findAllBySource(String source, Pageable pageable);
}
