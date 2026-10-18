package com.aztgg.api.techarticle.presentation;

import com.aztgg.api.techarticle.application.dto.GetTechArticleListResponseDto;
import com.aztgg.api.techarticle.application.dto.GetTechArticleSourceItemDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "TechArticle", description = "기술 아티클 API")
@ApiResponses(value = {
        @ApiResponse(
                responseCode = "400",
                description = "BAD_REQUEST",
                content = @Content
        ),
        @ApiResponse(
                responseCode = "500",
                description = "INTERNAL_SERVER_ERROR",
                content = @Content
        ),
})
public interface TechArticleApi {

    @Operation(tags = {"TechArticle"}, summary = "TechArticle source 목록 조회", description = """
            ## API 설명
            TechArticle의 source 목록을 조회합니다.
            """)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK"),
    })
    List<GetTechArticleSourceItemDto> getTechArticleSources();

    @Operation(tags = {"TechArticle"}, summary = "TechArticle 목록 조회", description = """
            ## API 설명
            TechArticle 목록을 조회합니다.
            기본 정렬은 createdAt 내림차순입니다.
            sort 파라미터 형식: `sort=createdAt,desc`
            """)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK"),
    })
    GetTechArticleListResponseDto getTechArticleList(int page,
                                                     int pageSize,
                                                     List<String> sort,
                                                     String source);
}
