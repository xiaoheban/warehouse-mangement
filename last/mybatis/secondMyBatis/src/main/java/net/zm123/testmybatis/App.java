package net.zm123.testmybatis;

import net.zm123.testmybatis.mapper.BrandMapper;
import net.zm123.testmybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            //List<Brand> brands = brandMapper.selectByCondition("1", "%南京%");
            Brand queryBrand = new Brand();
            queryBrand.setStatus("1");
            queryBrand.setCompanyName("%南京%");
            //List<Brand> brands = brandMapper.selectByCondition(queryBrand);
            //
            Map queryMap = new HashMap();
            //queryMap.put("status","1");
            //queryMap.put("companyName","%南京%");
            List<Brand> brands = brandMapper.selectByCondition(queryMap);
            if (brands != null && brands.size() > 0) {
                System.out.println(brands.get(0));
            }
            Brand queryBrand1 = new Brand();
            //queryBrand1.setStatus("1");
            //queryBrand1.setCompanyName("%南京%");
            List<Brand> brands1 = brandMapper.selectByConditionSingle(queryBrand1);
            if (brands1 != null && brands1.size() > 0) {
                System.out.println(brands1.get(0));
            }
            //最后需要关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
