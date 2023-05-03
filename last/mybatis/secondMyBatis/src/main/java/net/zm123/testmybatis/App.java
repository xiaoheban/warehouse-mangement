package net.zm123.testmybatis;

import net.zm123.testmybatis.mapper.BrandMapper;
import net.zm123.testmybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("hello.");
        String resource = "net/zm123/testmybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //获取mapper
            BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
            Brand brand = brandMapper.getBrand(2);
            System.out.println(brand);
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
