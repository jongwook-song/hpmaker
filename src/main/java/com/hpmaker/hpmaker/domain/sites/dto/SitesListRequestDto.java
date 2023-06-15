package com.hpmaker.hpmaker.domain.sites.dto;

import lombok.Getter;

@Getter
public class SitesListRequestDto {
    private Long id; // pk

    private String searchText;
    private String searchdate;
    private int currentPage;
}
