package com.yicj.content.config;

import com.yicj.content.service.ContentService;
import com.yicj.content.service.impl.CoreContentService;
import org.springframework.context.annotation.Bean;

public class CoreContentConfiguration {

    @Bean
    public ContentService contentService(){

        return new CoreContentService() ;
    }

}
