package net.zm123.test.mapper;

import net.zm123.test.pojo.User;

import java.util.List;

public interface UserMapper {
     User selectUser(int id);
     List<User> selectUsers();
}
