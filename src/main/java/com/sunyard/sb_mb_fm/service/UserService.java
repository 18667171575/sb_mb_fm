package com.sunyard.sb_mb_fm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.sb_mb_fm.entity.User;

import java.util.List;

public interface UserService extends IService<User>{

    List<User> findAll();
}
