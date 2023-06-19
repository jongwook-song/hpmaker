package com.hpmaker.hpmaker.domain.pageInfo;

import com.hpmaker.hpmaker.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class PageInfo  extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pageId;
    private String pagePath;
    private int defaultVersion;

    @Builder
    public PageInfo( Long pageId, String pagePath, int defaultVersion){
        this.pageId = pageId;
        this.pagePath = pagePath;
        this.defaultVersion = defaultVersion;
    }
}
