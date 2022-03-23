package com.sunyard.sb_mb_fm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.sb_mb_fm.entity.User;
import com.sunyard.sb_mb_fm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("UserDetailService")
public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User one = userService.getOne(new QueryWrapper<User>(new User() {{
            setName(username);
        }}));

        return null;
    }
}
