package com.yicj.format.config;

import com.yicj.format.processor.FormatProcessor;
import com.yicj.format.processor.JsonFormatProcessor;
import com.yicj.format.processor.StringFormatProcessor;
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
    // 注意不要使用@ConditionalOnClass(JSON.class)，否则引入该starter的项目会报错
    //Caused by: java.lang.ArrayStoreException: sun.reflect.annotation.TypeNotPresentExceptionProxy
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor() ;
    }

}
