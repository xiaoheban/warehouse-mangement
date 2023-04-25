package net.zm123.test;

import net.zm123.test.config.SpringConfig;
import net.zm123.test.dao.BookDao;
import net.zm123.test.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService);
        bookService.save();
    }
}
