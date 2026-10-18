package com.aztgg.api.techarticle.application;

import com.aztgg.api.techarticle.application.dto.GetTechArticleListRequestDto;
import com.aztgg.api.techarticle.application.dto.GetTechArticleListResponseDto;
import com.aztgg.api.techarticle.domain.TechArticle;
import com.aztgg.api.techarticle.domain.TechArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TechArticleService {

    private final TechArticleRepository techArticleRepository;

    public GetTechArticleListResponseDto getTechArticleList(GetTechArticleListRequestDto request) {
        PageRequest pageRequest = PageRequest.of(
                request.page(),
                request.pageSize(),
                Sort.by(Sort.Direction.fromString(request.sort().get(1)), request.sort().get(0))
        );
        Page<TechArticle> page = techArticleRepository.findAll(pageRequest);
        return GetTechArticleListResponseDto.from(page);
    }
}
