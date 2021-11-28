package com.yicj.aop.controller;

import com.yicj.aop.anno.LogTag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @LogTag
    @GetMapping("/hello")
    public String hello(){
        return "hello" ;
    }

    @LogTag
    @GetMapping("/hello2")
    public String hello2(){
        int a = 1/0 ;
        return "hello2" ;
    }

    @GetMapping("/hello3")
    public String hello3(){
        return "hello3" ;
    }
}
