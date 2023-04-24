package net.zm123.test;

import net.zm123.test.entry.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactory1 implements FactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}
