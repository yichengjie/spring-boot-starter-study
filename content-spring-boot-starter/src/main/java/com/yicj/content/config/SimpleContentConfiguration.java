package com.yicj.content.config;

import com.yicj.content.service.ContentService;
import com.yicj.content.service.impl.SimpleContentService;
import org.springframework.context.annotation.Bean;

public class SimpleContentConfiguration {

    @Bean
    public ContentService contentService(){
        return new SimpleContentService() ;
    }
}
