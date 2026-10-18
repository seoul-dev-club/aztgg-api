package com.aztgg.api.techarticle.application.dto;

import com.aztgg.api.global.asset.TechArticleSourceType;

public record GetTechArticleSourceItemDto(String code,
                                          String korean) {

    public static GetTechArticleSourceItemDto from(TechArticleSourceType type) {
        return new GetTechArticleSourceItemDto(type.name(), type.getKorean());
    }
}
