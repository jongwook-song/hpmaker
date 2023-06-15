package com.hpmaker.hpmaker.web.sites;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SitesReadController {
//    private final SiteService siteService;

//    @PostMapping("/find/sitesList")
//    public Page<Sites> findBySitesList( @RequestBody SitesListRequestDto sitesListRequestDto, HttpServletRequest request){
////    public Page<Sites> findByDate(@RequestBody NewsListRequestDto newsListRequestDto, HttpServletRequest request){
//        Page<Sites> bySitesList = null;//siteService.findBySitesList( sitesListRequestDto, request);
//        return bySitesList;
//    }

    @GetMapping("/hello")
    public String hello(){
//    public Page<Sites> findByDate(@RequestBody NewsListRequestDto newsListRequestDto, HttpServletRequest request){
        return "HelloWorld";
    }
}
