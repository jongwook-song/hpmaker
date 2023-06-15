package com.hpmaker.hpmaker.domain.sites.dto;

import lombok.Getter;

@Getter
public class SitesListRequestDtoBak {
    private Long id; // pk

    private String searchText;
    private String searchdate;
    private int currentPage;

}
