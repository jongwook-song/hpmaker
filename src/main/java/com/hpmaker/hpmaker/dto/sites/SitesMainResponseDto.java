package com.hpmaker.hpmaker.dto.sites;

import com.hpmaker.hpmaker.domain.sites.Sites;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class SitesMainResponseDto {
    private Long id;
    private String title;
    private String modifiedDate;
    private String modifiedTarget;

    public SitesMainResponseDto(Sites entity) {
        id = entity.getId();
        title = entity.getTitle();
        modifiedDate = toStringDateTime( entity.getModifiedDate());
        modifiedTarget = entity.getModifiedTarget();
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
