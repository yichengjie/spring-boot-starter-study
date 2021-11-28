package com.yicj.hello;

import com.yicj.dynamic.bean.PigPet;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class PigServiceTest {

    @Autowired
    private PigPet pigPet ;

    @Test
    public void test1(){
        String ret = pigPet.hello();
        log.info("ret : {}", ret);
    }

}
