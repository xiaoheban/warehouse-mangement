package com.funeasy;

import com.funeasy.config.SpringConfig;
import com.funeasy.dao.BookDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context.getBean(DataSource.class));
        BookDaoImpl bookDao = (BookDaoImpl) context.getBean("bookDao");
        System.out.println(bookDao);
    }
}
