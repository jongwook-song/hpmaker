package com.hpmaker.hpmaker.dto.sitesDetail;

import com.hpmaker.hpmaker.domain.sitesDetail.SitesDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SitesDetailSaveRequestDto {
    private String title;
    private String url;
    private Long siteId;
    private Long pageId;

    public SitesDetail toEntity(){
        return SitesDetail.builder()
                .title( title)
                .url( url)
                .siteId( siteId)
                .pageId( pageId)
                .build();
    }
}
