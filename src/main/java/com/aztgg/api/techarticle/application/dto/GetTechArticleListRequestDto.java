package com.aztgg.api.techarticle.application.dto;

import com.aztgg.api.global.exception.CommonErrorCode;
import com.aztgg.api.global.exception.CommonException;
import lombok.Builder;
import org.springframework.util.CollectionUtils;

import java.util.List;

public record GetTechArticleListRequestDto(int page,
                                           int pageSize,
                                           List<String> sort,
                                           String source) {

    @Builder
    public GetTechArticleListRequestDto {
        if (CollectionUtils.isEmpty(sort) || sort.size() != 2) {
            throw new CommonException(CommonErrorCode.BAD_REQUEST, "invalid sort");
        }
    }
}
