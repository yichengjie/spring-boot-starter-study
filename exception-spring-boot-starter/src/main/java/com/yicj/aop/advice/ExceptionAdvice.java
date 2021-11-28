package com.yicj.aop.advice;

import com.yicj.aop.vo.ResultVo;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ExceptionAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object retObj = null ;
        try {
            retObj = invocation.proceed() ;
        }catch (Exception e){
            return ResultVo.fail(e.getMessage()) ;
        }
        return retObj;
    }
}
