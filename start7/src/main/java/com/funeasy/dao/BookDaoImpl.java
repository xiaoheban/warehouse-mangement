package com.funeasy.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
@PropertySource({"user.properties"})
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String userName;
    @Override
    public void save() {
        System.out.println("BookDaoImpl save");
    }

    @Override
    public String toString() {
        return "BookDaoImpl{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
