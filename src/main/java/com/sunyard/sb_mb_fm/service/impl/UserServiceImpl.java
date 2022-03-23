package com.sunyard.sb_mb_fm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunyard.sb_mb_fm.dao.UserMapper;
import com.sunyard.sb_mb_fm.entity.User;
import com.sunyard.sb_mb_fm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Override
    public List<User>findAll(){
        List<User> users = this.getBaseMapper().selectList(new QueryWrapper<>());
        return users;
    }

}
