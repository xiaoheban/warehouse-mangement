package net.zm123.test.service;

import net.zm123.test.dao.BookDao;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private String bookName;//名称
    private int boolNum;//数量


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBoolNum(int boolNum) {
        this.boolNum = boolNum;
    }

    public void save() {
        System.out.println("BookServiceImpl save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "bookDao=" + bookDao +
                ", bookName='" + bookName + '\'' +
                ", boolNum=" + boolNum +
                '}';
    }
}
