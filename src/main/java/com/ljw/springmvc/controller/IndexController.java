package com.ljw.springmvc.controller;

import com.ljw.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/5 10:16
 */
@Controller
@SessionAttributes(types={Integer.class})
public class IndexController {


    @RequestMapping("/user")
    public String userPage(ModelMap modelMap) {
        modelMap.addAttribute("attr1","attr1");
        modelMap.addAttribute("attr2",25);
        modelMap.addAttribute("attr3",15);
        return "user";
    }

    @RequestMapping("/user2")
    public String userPage(@ModelAttribute("attr1")String attr1, @ModelAttribute("attr2")String attr2,@ModelAttribute("attr3")String attr3, SessionStatus status) {
        status.setComplete();
        return "user";
    }
}
