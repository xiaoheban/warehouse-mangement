package net.zm123.service;

import net.zm123.testjunit.TestjunitApplication;
import net.zm123.testjunit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * usersevice的测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestjunitApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void testAdd(){
        userService.add();
    }
}
