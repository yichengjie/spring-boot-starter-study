package com.yicj.study.config;

import com.yicj.study.format.FormatProcessor;
import com.yicj.study.format.JsonFormatProcessor;
import com.yicj.study.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatConfig {

    @Bean
    @Primary // FormatProcessor有多个实例时，要具体指定默认使用哪个
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor() ;
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor() ;
    }

}
