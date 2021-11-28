package com.yicj.enable;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//常用的spring-boot-starter-data-redis等就是这么玩的，但还有一种带@EnableXXX开关的自动配置就可以无META-INF/spring.factories，
// 需要自定义一个注解，注解中通过@Import来导入IdGenneratorConfiguration配置类，从而自动注册一个IdGennerator到spring容器.
// 这时需要主配置@EnableIdGenerator
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ImportAutoConfiguration(IdGeneratorAutoConfiguration.class)
public @interface EnableIdGenerator {

}
