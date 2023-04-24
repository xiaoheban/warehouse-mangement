package net.zm123.test;

import net.zm123.test.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂方法 bean创建
 */
public class App1 {
    public static void main(String[] args) {
       /* OrderDao dao = OrderStaticFactory.createOrder();
        System.out.println(dao);*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        System.out.println(orderDao);
    }
}
