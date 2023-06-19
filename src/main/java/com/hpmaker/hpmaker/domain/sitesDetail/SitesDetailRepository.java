package com.hpmaker.hpmaker.domain.sitesDetail;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SitesDetailRepository extends JpaRepository<SitesDetail, Long> {
    List<SitesDetail> findBySiteIdAndIsDelete(Long siteId, int isDelete);
}
