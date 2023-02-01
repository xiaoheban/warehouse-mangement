package com.funeasy.start5.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*@Component("bookService")*/
@Service("bookService")
//@Scope("sign")
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book impl save");
    }

    @PostConstruct
    private void init(){
        System.out.println("Book service init");
    }
    @PreDestroy
    private void destory(){
        System.out.println("Book service destory");
    }
}
