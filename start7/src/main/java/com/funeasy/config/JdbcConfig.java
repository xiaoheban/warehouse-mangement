package com.funeasy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.funeasy.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //管理第三方Bean
   /* @Bean//表示这是一个bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_db");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }*/
    //第三方bean依赖注入
    @Value("com.mysql.jdbc.Driver")
    private String driverName;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;

    @Bean//表示这是一个bean
    public DataSource dataSource(BookService bookService) {
        System.out.println("bookService");
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
