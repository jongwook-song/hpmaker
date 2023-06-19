package com.hpmaker.hpmaker.web.sitesDetail;

import com.hpmaker.hpmaker.domain.sitesDetail.SitesDetail;
import com.hpmaker.hpmaker.dto.sitesDetail.SitesDetailListRequestDto;
import com.hpmaker.hpmaker.service.sitesDetail.SitesDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class SitesDetailController {
    private SitesDetailService sitesDetailService;

    @PostMapping( "/siteDetail/findSiteDetail")
    public List<SitesDetail> findBySiteIdAndIsNotDelete(@RequestBody SitesDetailListRequestDto sitesDetailListRequestDto, HttpServletRequest request){
        return sitesDetailService.findBySiteIdAndIsNotDelete( sitesDetailListRequestDto);
    }
}
