package net.zm123.test;

import net.zm123.test.dao.OrderDao;
import net.zm123.test.dao.OrderDaoImpl;

public class OrderStaticFactory {
    public static OrderDao createOrder() {
        return new OrderDaoImpl();
    }
}
