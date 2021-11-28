package com.yicj.format;

import com.yicj.format.config.FormatConfig;
import com.yicj.format.config.HelloProperties;
import com.yicj.format.processor.FormatProcessor;
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
