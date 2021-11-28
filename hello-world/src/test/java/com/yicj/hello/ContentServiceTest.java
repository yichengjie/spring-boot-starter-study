package com.yicj.hello;


import com.yicj.content.service.ContentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class ContentServiceTest {

    @Autowired
    private ContentService contentService ;

    @Test
    public void doSomething(){
        String ret = contentService.doSomething();
        log.info("ret : {}", ret);
    }

}
