package com.yicj.hello;

import com.yicj.content.EnableContentService;
import com.yicj.dynamic.EnablePigService;
import com.yicj.enable.EnableIdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnablePigService(prefix = "test")
@EnableContentService(policy = "core")
@EnableIdGenerator
@SpringBootApplication
public class HelloApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args) ;
    }
}
