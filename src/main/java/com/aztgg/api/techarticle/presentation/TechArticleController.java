package com.aztgg.api.techarticle.presentation;

import com.aztgg.api.techarticle.application.TechArticleService;
import com.aztgg.api.techarticle.application.dto.GetTechArticleListRequestDto;
import com.aztgg.api.techarticle.application.dto.GetTechArticleListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/tech-articles")
public class TechArticleController implements TechArticleApi {

    private final TechArticleService techArticleService;

    @Override
    @GetMapping
    public GetTechArticleListResponseDto getTechArticleList(@RequestParam("page") int page,
                                                            @RequestParam("pageSize") int pageSize,
                                                            @RequestParam(value = "sort", defaultValue = "createdAt,desc") List<String> sort) {
        GetTechArticleListRequestDto requestDto = GetTechArticleListRequestDto.builder()
                .page(page)
                .pageSize(pageSize)
                .sort(sort)
                .build();
        return techArticleService.getTechArticleList(requestDto);
    }
}
