package com.tw.controller;

import com.tw.beans.User;
import com.tw.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hbowang on 5/10/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public ModelAndView register(User user){
        System.out.print(user.getName());
        userService.saveUser(user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/createSuccess");
        mv.addObject("user",user);
        return mv;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
