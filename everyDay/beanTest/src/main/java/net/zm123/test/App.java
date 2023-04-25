package net.zm123.test;

import net.zm123.test.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        //bookService.save();
        System.out.println(bookService);

        BookService bookService1 = (BookService) ctx.getBean("bookService1");
        System.out.println(bookService1);
    }
}
