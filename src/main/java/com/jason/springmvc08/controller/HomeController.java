package com.jason.springmvc08.controller;

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
@RequestMapping(path = "/home") //請求映射
public class HomeController {
    @RequestMapping(path = "/index") //請求映射
    public String index(Model model){
        model.addAttribute("message","Hello SpringMVC");
        return "index";
    }
}
