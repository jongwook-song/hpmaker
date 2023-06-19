package com.hpmaker.hpmaker.service.pageInfo;

import com.hpmaker.hpmaker.domain.pageInfo.PageInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PageInfoService {
    private final PageInfoRepository pageInfoRepository;
}
