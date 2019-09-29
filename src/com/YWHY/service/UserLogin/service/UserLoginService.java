package com.YWHY.service.UserLogin.service;

import com.YWHY.bean.User;

public interface UserLoginService {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByName(String user_name);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
