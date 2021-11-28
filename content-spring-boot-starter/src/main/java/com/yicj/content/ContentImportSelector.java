package com.yicj.content;

import com.yicj.content.config.CoreContentConfiguration;
import com.yicj.content.config.SimpleContentConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class ContentImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Class<?> annotationType = EnableContentService.class;
        Map<String, Object> annotationAttributes =
                importingClassMetadata.getAnnotationAttributes(annotationType.getName(), false);
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(annotationAttributes);
        String policy = attributes.getString("policy");
        if ("core".equals(policy)){
            return new String[]{CoreContentConfiguration.class.getName()} ;
        }else {
            return new String[]{SimpleContentConfiguration.class.getName()} ;
        }
    }

}