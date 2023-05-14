package net.zm123.springmybatis;

import net.zm123.springmybatis.domain.User;
import net.zm123.springmybatis.mapper.UserMapper;
import net.zm123.springmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringMybatisApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void testZhujieSelectAll() {
        List<User> users = userMapper.findAllUsers();
        if (users != null && users.size() > 0) {
            System.out.println("用戶 " + users.get(0));
        } else {
            System.out.println("沒有查詢到用戶");
        }
    }

    @Resource
    private UserXmlMapper userXmlMapper;
    @Test
    void testXmlUserSelectAll(){
        List<User> users = userXmlMapper.findAllUsers();
        System.out.println(users);
    }
    @Test
    void contextLoads() {
    }

}
