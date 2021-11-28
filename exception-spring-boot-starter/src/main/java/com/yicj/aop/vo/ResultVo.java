package com.yicj.aop.vo;

import lombok.Data;

@Data
public class ResultVo <T>{
    private String code ;
    private String msg ;
    private T data ;

    public static <T> ResultVo<T> success(T data){
        ResultVo <T> vo =  new ResultVo<>() ;
        vo.setCode("200");
        vo.setData(data);
        return vo ;
    }

    public static <T> ResultVo<T> fail(String msg){
        ResultVo <T> vo =  new ResultVo<>() ;
        vo.setCode("-1");
        vo.setMsg(msg);
        return vo ;
    }
}
