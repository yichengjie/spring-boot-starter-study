package com.yicj.aop.config;

import com.yicj.aop.aspect.AuthAspect;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AuthAspect authAspect(){

        return new AuthAspect() ;
    }
}
