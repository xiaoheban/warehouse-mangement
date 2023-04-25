package net.zm123.test.dao;

import org.springframework.stereotype.Repository;

@Repository("bookDao")//业务层
public class BookDaoImpl implements BookDao{
    public void save() {
        System.out.println("BookDaoImpl save");
    }
}
