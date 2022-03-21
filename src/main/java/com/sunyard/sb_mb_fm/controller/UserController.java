package com.sunyard.sb_mb_fm.controller;

import com.sunyard.sb_mb_fm.entity.User;
import com.sunyard.sb_mb_fm.service.UserService;
import com.sunyard.sb_mb_fm.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public Page getList(){
        int a=1/0;
        List<User> all = userService.findAll();
        return new Page<User>().setCount(all.size()).setData(all);
    }

}
