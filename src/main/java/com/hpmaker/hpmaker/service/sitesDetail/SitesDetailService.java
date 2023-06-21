package com.hpmaker.hpmaker.service.sitesDetail;

import com.hpmaker.hpmaker.domain.sitesDetail.SitesDetail;
import com.hpmaker.hpmaker.dto.sitesDetail.SitesDetailListRequestDto;
import com.hpmaker.hpmaker.domain.sitesDetail.SitesDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SitesDetailService {
    private final SitesDetailRepository sitesDetailRepository;
//    private final SitesRepositorySupport sitesRepositorySupport;
    @Transactional(readOnly = true)
    public List< SitesDetail> findBySiteIdAndIsNotDelete( SitesDetailListRequestDto sitesDetailListRequestDto){
        return sitesDetailRepository.findBySiteIdAndIsDelete( sitesDetailListRequestDto.getSiteId(), SitesDetail.IS_NOT_DELETE_STATUS);
    }
}
