package com.funeasy.start6.service;

import com.funeasy.start6.dao.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDaoImpl bookDao;
    @Override
    public void save() {
        System.out.println("BookServiceImpl save");
        bookDao.save();
    }
}
