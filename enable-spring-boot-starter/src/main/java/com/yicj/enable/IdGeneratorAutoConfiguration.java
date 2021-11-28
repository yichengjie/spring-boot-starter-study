package com.yicj.enable;

import com.yicj.enable.config.IdGeneratorProperties;
import com.yicj.enable.generator.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(IdGenerator.class)
//开启自动配置，注册一个IdGeneratorProperties类型的配置bean到spring容器，同普通的@EnableAsync等开关一样
@EnableConfigurationProperties(IdGeneratorProperties.class)
public class IdGeneratorAutoConfiguration {
    @Autowired
    IdGeneratorProperties properties;

    @Bean
    public  IdGenerator getIdGenerator(){
        IdGenerator generator = new IdGenerator();
        generator.setRandomLength(properties.getRandomLength());
        generator.setPrefix(properties.getPrefix());
        return generator;
    }
}