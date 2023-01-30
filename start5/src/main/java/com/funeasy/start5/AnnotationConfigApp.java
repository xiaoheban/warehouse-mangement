package com.funeasy.start5;

import com.funeasy.start5.config.SpringConfig;
import com.funeasy.start5.dao.BookDao;
import com.funeasy.start5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApp {
    public static void main(String[] args) {
        //纯注解方式
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
