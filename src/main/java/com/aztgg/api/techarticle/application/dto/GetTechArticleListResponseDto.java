package com.aztgg.api.techarticle.application.dto;

import com.aztgg.api.techarticle.domain.TechArticle;
import org.springframework.data.domain.Page;

import java.util.List;

public record GetTechArticleListResponseDto(List<GetTechArticleItemDto> list,
                                            MetadataDto metadata) {

    public record MetadataDto(long totalElements) {
    }

    public static GetTechArticleListResponseDto from(Page<TechArticle> page) {
        List<GetTechArticleItemDto> list = page.getContent().stream()
                .map(GetTechArticleItemDto::from)
                .toList();

        return new GetTechArticleListResponseDto(list, new MetadataDto(page.getTotalElements()));
    }
}
