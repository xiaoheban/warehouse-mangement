package net.zm123.springmybatis.mapper;

import net.zm123.springmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserXmlMapper {
    List<User> findAllUsers();
}
