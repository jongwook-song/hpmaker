package com.hpmaker.hpmaker.service.sites;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SiteService {
//    private final SitesRepository sitesRepository;
//    private final SitesRepositorySupport sitesRepositorySupport;

//    public Page<Sites> findBySitesList( SitesListRequestDto sitesListRequestDto, HttpServletRequest request){
//        Page<Sites> siteLists = null;
//        Predicate searchCondition = null;
//
//        Pageable paging = PageRequest.of( sitesListRequestDto.getCurrentPage(), 10, new Sort(Sort.Direction.DESC, "createdate"));
//
////        searchCondition = newsRepositorySupport.findBySearchdate( newsListRequestDto.getSearchdate());
//
////        newsLists = newsRepository.findAll( searchCondition, paging);
//
////        if( newsListRequestDto.getCurrentPage() == 0) {
////            String ip = historyService.getLocalServerIp(request);
////            String browser = historyService.getBrowserInfo(request);
////
////            HistorySaveRequestDto historySaveRequestDto = new HistorySaveRequestDto("IP:" + ip + "|BrowserInfo:" + browser,
////                    null, History.OPERATION_SEARCH_DATE, newsListRequestDto.getSearchdate(), null);
////            historyService.save(historySaveRequestDto);
////        }
//
//        return siteLists;
//    }
}