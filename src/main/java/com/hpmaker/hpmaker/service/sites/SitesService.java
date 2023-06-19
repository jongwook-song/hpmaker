package com.hpmaker.hpmaker.service.sites;

import com.hpmaker.hpmaker.domain.sites.Sites;
import com.hpmaker.hpmaker.domain.sites.SitesRepository;
import com.hpmaker.hpmaker.dto.sites.SitesMainResponseDto;
import com.hpmaker.hpmaker.dto.sites.SitesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SitesService {
    private final SitesRepository sitesRepository;
//    private final SitesRepositorySupport sitesRepositorySupport;

    @Transactional(readOnly = true)
    public List<SitesMainResponseDto> findIsNotDelete() {
        return sitesRepository.findByIsDelete( Sites.IS_NOT_DELETE_STATUS)
                            .map( SitesMainResponseDto::new)
//                            .map(sites -> new SitesMainResponseDto( sites))
                            .collect( Collectors.toList());

//        List<SitesMainResponseDto> sitesList = sitesRepository.findByIsDelete( 0).map(sites -> new SitesMainResponseDto( sites));
//        return postsRepository.findAllDesc()  .map(posts -> new PostsMainResponseDto(posts))
//                .map(PostsMainResponseDto::new)
//                .collect(Collectors.toList());
    }

    @Transactional
    public Sites saveSite(SitesSaveRequestDto saveRequestDto){
        return sitesRepository.save( saveRequestDto.toEntity());
    }

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
