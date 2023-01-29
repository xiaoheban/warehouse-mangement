package com.funeasy.service;

import com.funeasy.dao.BookDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements InitializingBean, DisposableBean {
    private BookDaoImpl bookDao;

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Book service destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Book service init");
    }
}
