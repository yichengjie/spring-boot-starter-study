package com.yicj.hello;

import com.yicj.enable.generator.IdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class IdGeneratorTest {

    @Autowired
    private IdGenerator idGenerator ;

    @Test
    public void getPrefixTimeRandomId(){
        String prefixTimeRandomId = idGenerator.getPrefixTimeRandomId();
        log.info("========> id : {}", prefixTimeRandomId);
    }
}
