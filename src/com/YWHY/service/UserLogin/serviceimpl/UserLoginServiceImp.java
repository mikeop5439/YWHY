package com.YWHY.service.UserLogin.serviceimpl;

import com.YWHY.bean.User;


import com.YWHY.mapper.UserLogin.UserMapper;
import com.YWHY.service.UserLogin.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImp implements UserLoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer userId) {
        userMapper.deleteByPrimaryKey(userId);
        return 0;
    }

    @Override
    public int insert(User record) {
        userMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        userMapper.insertSelective(record);
        return 0;
    }

    @Override
    public User selectByName(String user_name) {
        return userMapper.selectByName(user_name);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        userMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        userMapper.updateByPrimaryKey(record);
        return 0;
    }
}
