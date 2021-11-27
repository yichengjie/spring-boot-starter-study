package com.yicj.study;

import com.yicj.study.format.JsonFormatProcessor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class HelloTest {

   @Autowired
    private HelloFormatTemplate helloFormatTemplate ;

    @Test
    public void test1(){
        HelloFormatTemplate template = new HelloFormatTemplate(new JsonFormatProcessor()) ;
        String ret = template.doFormat("hello starter ");
        log.info("=====> format str : {}" ,ret);
    }


    @Test
    public void test2(){
        String ret = helloFormatTemplate.doFormat("hello starter ");
        log.info("=====> format str : {}" ,ret);
    }
}
