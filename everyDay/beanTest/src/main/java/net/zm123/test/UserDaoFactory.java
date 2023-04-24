package net.zm123.test;

import net.zm123.test.dao.UserDao;
import net.zm123.test.dao.UserDaoImpl;

/**
 * 对象工厂方法创建bean
 */
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
