package com.funeasy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.funeasy")//扫描com.funeasy
@PropertySource("jdbc.properties")//配置文件
@Import({JdbcConfig.class})//导入配置
public class SpringConfig {
}
