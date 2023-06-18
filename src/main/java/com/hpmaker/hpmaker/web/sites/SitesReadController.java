package com.hpmaker.hpmaker.web.sites;

import com.hpmaker.hpmaker.domain.sites.Sites;
import com.hpmaker.hpmaker.domain.sites.dto.SitesSaveRequestDto;
import com.hpmaker.hpmaker.service.sites.SiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class SitesReadController {
    private final SiteService siteService;

    @PostMapping( "/site/findAll")
    public List< Sites> sitesFindAll( HttpServletRequest request){
//    public Page<Sites> findByDate(@RequestBody NewsListRequestDto newsListRequestDto, HttpServletRequest request){
//        Page<Sites> bySitesList = null;//siteService.findBySitesList( sitesListRequestDto, request);
        return siteService.findAll();
    }

    @PostMapping( "site/saveSite")
    public Sites saveSite( @RequestBody SitesSaveRequestDto sitesSaveRequestDto){
        return siteService.saveSite( sitesSaveRequestDto);
    }
}
