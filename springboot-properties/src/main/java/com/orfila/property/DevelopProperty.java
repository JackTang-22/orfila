package com.orfila.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author tangye
 * @Date 2020/8/23
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DevelopProperty {

    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
