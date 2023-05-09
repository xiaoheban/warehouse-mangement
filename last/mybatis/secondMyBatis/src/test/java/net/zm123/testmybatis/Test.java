package net.zm123.testmybatis;

import net.zm123.testmybatis.mapper.BrandMapper;
import net.zm123.testmybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    @org.junit.Test
    public void testAdd() {
        String resource = "net/zm123/testmybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            //获取mapper
            BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
            Brand brand = brandMapper.getBrand(2);
            System.out.println(brand);
            //List<Brand> brands = brandMapper.selectByCondition("1", "%南京%");
            Brand newBrand = new Brand();
            newBrand.setStatus("0");
            newBrand.setBrandName("超越全部");
            newBrand.setCompanyName("南京上上签有限公司");
            newBrand.setAddr("紫峰大厦20号");
            int count = brandMapper.add(newBrand);
            System.out.println("line " + count + " " + newBrand);
            //sqlSession.commit();//开启事务以后需要commit一下才能真正提交
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testUpdate() {
        String resource = "net/zm123/testmybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            //获取mapper
            BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
            Brand newBrand = new Brand();
            newBrand.setId(2);
            newBrand.setStatus("0");
            newBrand.setBrandName("超越全部12");
            newBrand.setCompanyName("快乐公司");
            /*newBrand.setAddr("修改后的地址");*/
            brandMapper.updateBrand(newBrand);
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testDeleteOne() {
        String resource = "net/zm123/testmybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            //获取mapper
            BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
            brandMapper.deleteById(3);
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testDeleteIds() {
        String resource = "net/zm123/testmybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            //获取mapper
            BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
            brandMapper.deleteByIds(new int[]{1, 4, 6});
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
