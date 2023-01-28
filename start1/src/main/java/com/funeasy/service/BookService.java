package com.funeasy.service;

import com.funeasy.dao.BookDao;

public class BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
