package com.aztgg.api.techarticle.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "tech_article")
@NoArgsConstructor
public class TechArticle {

    @Id
    @Column(name = "techArticleId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long techArticleId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "link")
    private String link;

    @Column(name = "source")
    private String source;

    @Column(name = "writer")
    private String writer;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "scrapedAt")
    private LocalDateTime scrapedAt;

    @Column(name = "hash")
    private String hash;
}
