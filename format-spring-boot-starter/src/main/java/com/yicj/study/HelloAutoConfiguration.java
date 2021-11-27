package com.yicj.study;

import com.yicj.study.config.FormatConfig;
import com.yicj.study.config.HelloProperties;
import com.yicj.study.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FormatConfig.class})
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor formatProcessor, HelloProperties helloProperties){
        return new HelloFormatTemplate(formatProcessor, helloProperties) ;
    }
}
