package com.funeasy.start5.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*@Component("bookDao")*/
@Repository("bookDao")
public class BookDaoImpl implements BookDao{
    @Override
    public void save() {
        System.out.println("book dao save impl");
    }
}
