package com.candice.webproject.controller;

import com.candice.webproject.entity.User;
import com.candice.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by candice on 2018/4/13.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "getUser")
    @ResponseBody
    public String showUser(@RequestParam(value = "userName")String userName){
        User user =userService.findByUsername(userName);
        return user.getMobile()+user.getId();
    }
}
