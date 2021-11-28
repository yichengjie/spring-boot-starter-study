package com.yicj.aop.aspect;

import com.yicj.aop.anno.LogTag;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class AuthAspect {

    @Pointcut("execution(* com.yicj.aop.controller..*Controller.*(..)) ")
    public void pointcut(){}


    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        Class<?> aClass = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature)point.getSignature();
        Method method = signature.getMethod();
        LogTag logTag = method.getAnnotation(LogTag.class);
        if (logTag != null && logTag.value()){
            return this.doLog(point) ;
        }
        return point.proceed() ;
    }

    private Object doLog(ProceedingJoinPoint point) throws Throwable {
        try {
            log.info("before method .......");
             return point.proceed() ;
        }finally {
            log.info("after method .......");
        }
    }



}
