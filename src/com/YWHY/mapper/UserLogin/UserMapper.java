package com.YWHY.mapper.UserLogin;

import com.YWHY.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByName(String user_name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}