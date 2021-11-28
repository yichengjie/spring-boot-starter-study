package com.yicj.aop;


import com.yicj.aop.advice.ExceptionAdvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

@Slf4j
@ConditionalOnProperty("aop.exception.pointcut")
public class ExceptionHandlerConfig {

    //execution(* com.yicj.aop.controller..*Controller.*(..))
    @Value("${aop.exception.pointcut}")
    private String pointcutExpression ;

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
