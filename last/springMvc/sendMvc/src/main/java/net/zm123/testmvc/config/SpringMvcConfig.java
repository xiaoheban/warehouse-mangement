package net.zm123.testmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("net.zm123.testmvc.controller")
@EnableWebMvc //开启自动json转换
public class SpringMvcConfig {
}
