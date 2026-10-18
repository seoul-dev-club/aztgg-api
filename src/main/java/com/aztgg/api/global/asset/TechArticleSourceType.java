package com.aztgg.api.global.asset;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TechArticleSourceType {

    GEEK_NEWS("Geek News", "https://news.hada.io/rss/news"),
    KOREAN_FE("KOREAN FE Article", "https://kofearticle.substack.com/feed"),
    KAKAO_TECH("카카오 기술 블로그", "https://tech.kakao.com/feed"),
    WOOWAHAN("우아한 형제들 기술 블로그", "https://techblog.woowahan.com/feed/"),
    DAANGN("당근 기술 블로그", "https://medium.com/feed/daangn"),
    TOSS("토스 기술 블로그", "https://toss.tech/rss.xml"),
    ;

    private final String korean;
    private final String rssUrl;
}

