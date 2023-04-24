package net.zm123.test.service;

import net.zm123.test.dao.BookDao;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("BookServiceImpl save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
