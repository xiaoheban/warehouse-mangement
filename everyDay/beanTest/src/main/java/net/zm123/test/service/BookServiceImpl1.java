package net.zm123.test.service;

import net.zm123.test.dao.BookDao;

public class BookServiceImpl1 implements BookService{
    private int num;
    private String name;
    private BookDao bookDao;

    public BookServiceImpl1(int num, String name,BookDao bookDao) {
        this.num = num;
        this.name = name;
        this.bookDao = bookDao;
    }

    public void save() {

    }

    @Override
    public String toString() {
        return "BookServiceImpl1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", bookDao=" + bookDao +
                '}';
    }
}
