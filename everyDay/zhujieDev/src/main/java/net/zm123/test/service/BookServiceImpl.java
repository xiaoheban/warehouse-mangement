package net.zm123.test.service;

import net.zm123.test.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Value("平凡的世界2")
    private String name;

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
                ", name='" + name + '\'' +
                '}';
    }
}
