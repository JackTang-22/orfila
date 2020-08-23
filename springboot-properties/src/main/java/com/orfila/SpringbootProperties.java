package com.orfila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangye
 * @Date 2020/8/23
 */
@SpringBootApplication
@RestController
public class SpringbootProperties {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProperties.class, args);
    }
}
