package com.aztgg.api.techarticle.application.dto;

import com.aztgg.api.techarticle.domain.TechArticle;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record GetTechArticleItemDto(Long techArticleId,
                                    String title,
                                    String description,
                                    String link,
                                    String source,
                                    String writer,
                                    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") LocalDateTime createdAt) {

    public static GetTechArticleItemDto from(TechArticle techArticle) {
        return new GetTechArticleItemDto(
                techArticle.getTechArticleId(),
                techArticle.getTitle(),
                techArticle.getDescription(),
                techArticle.getLink(),
                techArticle.getSource(),
                techArticle.getWriter(),
                techArticle.getCreatedAt()
        );
    }
}
