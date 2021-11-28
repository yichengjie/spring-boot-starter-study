package com.yicj.hello;

import com.yicj.hello.config.FormatConfig;
import com.yicj.hello.config.HelloProperties;
import com.yicj.hello.processor.FormatProcessor;
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
