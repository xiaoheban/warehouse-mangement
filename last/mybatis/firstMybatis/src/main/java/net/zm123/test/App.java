package net.zm123.test;

import net.zm123.test.mapper.UserMapper;
import net.zm123.test.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("first my batis");
        String resource = "net/zm123/test/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //方法1
            User user = sqlSession.selectOne("net.zm123.test.mapper.UserMapper.selectUser", 1);
            System.out.println(user);
            //方法2

            //获取mapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user1 = userMapper.selectUser(2);
            System.out.println(user1);
            List<User> users = userMapper.selectUsers();
            System.out.println("all users " + users.get(0));


            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
