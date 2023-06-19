package com.hpmaker.hpmaker.domain.sitesDetail;

import com.hpmaker.hpmaker.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class SitesDetail extends BaseTimeEntity {
    public final static int IS_NOT_DELETE_STATUS = 0;
    public final static int IS_DELETE_STATUS = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // pk

    @Column(columnDefinition = "TEXT", nullable = false)
    private String title;
    private String url;
    private Long siteId;
    private Long pageId;
    private int isDelete; // 기본값 : 0, 삭제 시 : 1

    @Builder
    public SitesDetail(Long id, String title, String url, Long siteId, Long pageId, int isDelete){
        this.id = id;
        this.title = title;
        this.isDelete = isDelete;
        this.url = url;
        this.siteId = siteId;
        this.pageId = pageId;
    }
}
