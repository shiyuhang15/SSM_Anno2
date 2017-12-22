package com.syh.serviceImp;

import com.syh.mapper.UserMapper;
import com.syh.pojo.User;
import com.syh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        System.out.println("--service--");
        userMapper.saveUser(user);
    }
}
