package com.hpmaker.hpmaker.domain.sitesDetail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SitesDetailRepositoryTest {
    @Autowired
    SitesDetailRepository sitesDetailRepository;

//    @After
//    public void cleanup() {
//        /**
//         이후 테스트 코드에 영향을 끼치지 않기 위해
//         테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
//         **/
//        sitesDetailRepository.deleteAll();
//    }

    @Test
    public void getSiteList_TEST() {
        //given
        sitesDetailRepository.save(SitesDetail.builder()
                .title("테스트 게시글")
                .build());

        //when
        List<SitesDetail> sitesList = sitesDetailRepository.findAll();

        //then
        SitesDetail site = sitesList.get(0);
        assertThat(site.getTitle(), is("테스트 게시글"));
    }

    @Test
    public void BaseTimeEntitySave_TEST () {
        //given
        sitesDetailRepository.save(SitesDetail.builder()
                .title("테스트 게시글")
                .build());

        //when
        List<SitesDetail> sitesList = sitesDetailRepository.findAll();

        //then
        SitesDetail site = sitesList.get(0);
        assertThat(site.getTitle(), is("테스트 게시글"));
    }
}
