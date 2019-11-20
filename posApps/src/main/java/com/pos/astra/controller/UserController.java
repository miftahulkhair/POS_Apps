package com.pos.astra.controller;


import com.pos.astra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public ModelAndView getUsers()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", userService.getUser(1));
        mv.setViewName("users");

        return mv;
    }
}
