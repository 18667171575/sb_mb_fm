package com.sunyard.sb_mb_fm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.sb_mb_fm.entity.User;

public interface UserMapper extends BaseMapper<User>{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}