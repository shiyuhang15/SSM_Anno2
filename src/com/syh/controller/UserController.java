package com.syh.controller;

import com.syh.pojo.User;
import com.syh.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/reg")
    public ModelAndView reg(User user){
        System.out.println("--controller--");
        userService.saveUser(user);
        ModelAndView mav=new ModelAndView();
        mav.getModel().put("user",user);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        return mav;
    }
}
