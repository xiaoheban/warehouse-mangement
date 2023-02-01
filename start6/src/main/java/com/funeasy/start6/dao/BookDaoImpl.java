package com.funeasy.start6.dao;

import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao{
    @Override
    public void save() {
        System.out.println("BookDaoImp save");
    }
}
