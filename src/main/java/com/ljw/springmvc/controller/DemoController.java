package com.ljw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/2 22:03
 */
@Controller
public class DemoController {

    @GetMapping("/test")
    public String test(){
        return "demo";
    }
}
