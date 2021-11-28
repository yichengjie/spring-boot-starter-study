package com.yicj.aop;

import com.yicj.aop.config.ExceptionHandlerConfig;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;
import java.util.Map;

public class ExceptionImportSelector implements ImportBeanDefinitionRegistrar {

    private static final String BEAN = "exceptionImportSelector" ;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableExceptionHandler.class.getName());
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(annotationAttributes);
        String attrValue = attributes.getString("value") ;
        if (!StringUtils.isEmpty(attrValue)){
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(ExceptionHandlerConfig.class);
            builder.addConstructorArgValue(attrValue) ;
            AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
            registry.registerBeanDefinition(BEAN,beanDefinition);
        }
    }
}
