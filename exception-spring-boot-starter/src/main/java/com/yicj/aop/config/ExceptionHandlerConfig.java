package com.yicj.aop.config;


import com.yicj.aop.advice.ExceptionAdvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

@Slf4j
public class ExceptionHandlerConfig {

    private String pointcutExpression ;

    public ExceptionHandlerConfig(String pointcutExpression){
        this.pointcutExpression = pointcutExpression ;
    }

    @Bean
    public DefaultPointcutAdvisor exceptionAdvisor(){
        if (StringUtils.isEmpty(pointcutExpression)){
            return null ;
        }
        // advice
        ExceptionAdvice advice = new ExceptionAdvice();
        // pointcut
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut() ;
        pointcut.setExpression(pointcutExpression);
        // advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor() ;
        advisor.setPointcut(pointcut);
        advisor.setAdvice(advice);
        //
        log.info("add exception aop ..");
        return advisor ;
    }
}
