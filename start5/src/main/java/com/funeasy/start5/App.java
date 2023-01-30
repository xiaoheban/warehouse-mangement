package com.funeasy.start5;

import com.funeasy.start5.dao.BookDao;
import com.funeasy.start5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //用xml方式获取bean
  /*      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();*/
        //用注解方式获取bean
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
