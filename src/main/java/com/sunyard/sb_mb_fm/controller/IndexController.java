package com.sunyard.sb_mb_fm.controller;

import com.sunyard.sb_mb_fm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping({"/login","/"})
    public String login(Model model){
        int a=1/0;
//        List<User> all = userService.findAll();
//        model.addAttribute("users",all);
        return "/main/home-page";
    }

}
