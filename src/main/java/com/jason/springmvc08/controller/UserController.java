package com.jason.springmvc08.controller;

import com.jason.springmvc08.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringMVC01
 * @description:
 * @author: Liu
 * @create: 2018-07-25
 */
@Controller //聲明為控制器
@RequestMapping(path = "/user") //請求映射
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/index") //請求映射
    public String index(Model model){
        model.addAttribute("list",userService.queryAllUsers());
        return "user/index";
    }
}
