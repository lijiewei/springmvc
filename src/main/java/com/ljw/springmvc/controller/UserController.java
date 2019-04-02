package com.ljw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 用户控制层
 * @Author: Administrator
 * @CreateDate: 2019/4/2 23:47
 */
@Controller
@RequestMapping("/userEdit")
public class UserController {

    @GetMapping("")
    public String goPage(){
        return "userEdit";
    }
}
