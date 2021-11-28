package com.yicj.hello;

import com.yicj.content.EnableContentService;
import com.yicj.enable.EnableIdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableContentService(policy = "core")
@EnableIdGenerator
@SpringBootApplication
public class HelloApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args) ;
    }
}
