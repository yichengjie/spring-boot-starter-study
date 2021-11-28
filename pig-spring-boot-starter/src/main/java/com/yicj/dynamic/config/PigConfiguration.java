package com.yicj.dynamic.config;

import com.yicj.dynamic.bean.PigPet;
import org.springframework.context.annotation.Bean;

public class PigConfiguration {

    private String prefix ;

    private PigConfiguration(String prefix){
        this.prefix = prefix ;
    }

    @Bean
    public PigPet pigPet(){
        PigPet pigPet = new PigPet();
        pigPet.setPrefix(prefix);
        return pigPet ;
    }
}
