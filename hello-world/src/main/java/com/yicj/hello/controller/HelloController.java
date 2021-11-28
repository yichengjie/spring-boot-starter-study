package com.yicj.hello.controller;

import com.yicj.aop.vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResultVo<String> hello(){
        return ResultVo.success("Hello") ;
    }

    @GetMapping("/hello2")
    public ResultVo<String> hello2(){
        int a = 1/0 ;
        return ResultVo.success("Hello2") ;
    }

}
