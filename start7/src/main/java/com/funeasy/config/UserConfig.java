package com.funeasy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"user.properties"})
public class UserConfig {
    @Value("${name}")
    private String userName;

    public void print() {
        System.out.println(userName);
    }
}
