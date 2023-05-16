package net.zm123.springmybatis.mapper;

import net.zm123.springmybatis.domain.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BrandMapper {
    List<Brand> getBrands();
}
