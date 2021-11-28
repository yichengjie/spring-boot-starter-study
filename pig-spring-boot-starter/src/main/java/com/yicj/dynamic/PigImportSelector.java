package com.yicj.dynamic;

import com.yicj.dynamic.config.PigConfiguration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class PigImportSelector implements ImportBeanDefinitionRegistrar {

    private static final String BEAN = "pigImportSelector" ;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        Class<?> annotationType = EnablePigService.class;

        Map<String, Object> annotationAttributes =
                importingClassMetadata.getAnnotationAttributes(annotationType.getName(), false);
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(annotationAttributes);
        String prefix = attributes.getString("prefix");

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(PigConfiguration.class);
        beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, prefix);
        beanDefinition.setRole(BeanDefinition.ROLE_APPLICATION);
        registry.registerBeanDefinition(BEAN, beanDefinition);
    }
}
