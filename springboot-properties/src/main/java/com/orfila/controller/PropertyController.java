package com.orfila.controller;

import cn.hutool.core.lang.Dict;
import com.orfila.property.ApplicationProperty;
import com.orfila.property.DevelopProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangye
 * @Date 2020/8/23
 */
@RestController
public class PropertyController {

    private final ApplicationProperty applicationProperty;
    private final DevelopProperty developProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DevelopProperty developProperty) {
        this.applicationProperty = applicationProperty;
        this.developProperty = developProperty;
    }

    @GetMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developProperty", developProperty);
    }
}
