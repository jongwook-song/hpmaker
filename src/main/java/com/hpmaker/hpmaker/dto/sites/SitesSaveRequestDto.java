package com.hpmaker.hpmaker.dto.sites;

import com.hpmaker.hpmaker.domain.sites.Sites;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SitesSaveRequestDto {
    private String title;

    public Sites toEntity(){
        return Sites.builder()
                .title( title)
                .build();
    }
}
