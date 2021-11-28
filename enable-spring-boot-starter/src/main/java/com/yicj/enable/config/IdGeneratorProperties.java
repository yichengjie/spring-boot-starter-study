package com.yicj.enable.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "jwolf.id.generator")
public class IdGeneratorProperties {
    private Integer randomLength=6;
    private String prefix= "jwolf";
}
