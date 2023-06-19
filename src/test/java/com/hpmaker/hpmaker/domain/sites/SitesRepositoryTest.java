package com.hpmaker.hpmaker.domain.sites;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SitesRepositoryTest {
    @Autowired
    SitesRepository sitesRepository;

//    @After
//    public void cleanup() {
//        /**
//         이후 테스트 코드에 영향을 끼치지 않기 위해
//         테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
//         **/
//        sitesRepository.deleteAll();
//    }

//    @Test
//    public void BaseTimeEntity_등록 () {
//        //given
//        sitesRepository.save(Sites.builder()
//                .title("테스트 게시글")
//                .build());
//
//        //when
//        List<Sites> sitesList = sitesRepository.findAll();
//
//        //then‘
//        Sites site = sitesList.get(0);
//        assertThat(site.getTitle(), is("테스트 게시글"));
//    }

    @Test
    public void getSiteDetailList_TEST() {
        //given
//        sitesRepository.save(Sites.builder()
//                .title("테스트 게시글")
//                .build());
//        SitesListRequestDto sitesListRequestDto = new SitesListRequestDto();
//        Long id = Long.valueOf(6);
        //when
//        List<Sites> sitesList = sitesRepository.findByIdAndIsDelete( id, 0);

        //then
//        Sites site = sitesList.get(0);
//        assertThat(site.getTitle(), is("Test"));
    }
}
