package com.funeasy.srpingtest.service;

import com.funeasy.srpingtest.dao.BookDaoImpl;

public class BookServieImpl {
    private BookDaoImpl dao = new BookDaoImpl();

    public void save() {
        System.out.println("book Service save");
        dao.save();
    }
}
