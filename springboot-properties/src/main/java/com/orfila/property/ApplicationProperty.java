package com.orfila.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author tangye
 * @Date 2020/8/23
 */
@Data
@Component
public class ApplicationProperty {

    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
