package com.funeasy.start6;

import com.funeasy.start6.config.SpringConfig;
import com.funeasy.start6.service.BookServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 纯注解方式依赖注入
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServiceImpl service = (BookServiceImpl) ctx.getBean("bookService");
        service.save();
    }
}
