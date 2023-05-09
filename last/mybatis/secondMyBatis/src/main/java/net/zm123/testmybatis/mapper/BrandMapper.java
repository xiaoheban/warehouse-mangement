package net.zm123.testmybatis.mapper;

import net.zm123.testmybatis.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BrandMapper {
    Brand getBrand(int id);

    //散装参数
    //List<Brand> selectByCondition(@Param("status") String status, @Param("companyName") String companyName);

    //对象参数
    // List<Brand> selectByCondition(Brand brand);

    //map参数
    List<Brand> selectByCondition(Map map);

    /**
     * 但条件动态查询
     *
     * @param brand
     * @return
     */
    List<Brand> selectByConditionSingle(Brand brand);

    /**
     * 增加
     *
     * @param brand
     */
    int add(Brand brand);

    /**
     * 更新数据
     *
     * @param brand
     */
    void updateBrand(Brand brand);

    /**
     * 删除单个
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);
}
