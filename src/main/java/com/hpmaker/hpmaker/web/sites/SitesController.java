package com.hpmaker.hpmaker.web.sites;

import com.hpmaker.hpmaker.domain.sites.Sites;
import com.hpmaker.hpmaker.dto.sites.SitesMainResponseDto;
import com.hpmaker.hpmaker.dto.sites.SitesSaveRequestDto;
import com.hpmaker.hpmaker.service.sites.SitesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class SitesController {
    private final SitesService siteService;

    @PostMapping( "/site/findIsNotDelete")
    public List<SitesMainResponseDto> sitesFindIsDelete( HttpServletRequest request){
//    public Page<Sites> findByDate(@RequestBody NewsListRequestDto newsListRequestDto, HttpServletRequest request){
//        Page<Sites> bySitesList = null;//siteService.findBySitesList( sitesListRequestDto, request);
        return siteService.findIsNotDelete();
    }

    @PostMapping( "site/saveSite")
    public Sites saveSite( @RequestBody SitesSaveRequestDto sitesSaveRequestDto){
        return siteService.saveSite( sitesSaveRequestDto);
    }
}
