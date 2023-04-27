package net.zm123.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("net.zm123.rest.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
