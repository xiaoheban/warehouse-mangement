package com.funeasy.start5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Component("bookService")*/
@Service("bookService")
public class BookServiceImpl implements BookService{
    @Override
    public void save() {
        System.out.println("book impl save");
    }
}
