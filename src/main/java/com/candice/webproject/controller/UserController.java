package com.candice.webproject.controller;

import com.candice.webproject.entity.User;
import com.candice.webproject.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by candice on 2018/4/13.
 */
@Controller
@RequestMapping(value = "/user")
@Api("userController相关api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String index(){
        return "user";
    }

    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="userName",dataType="String",required=true,value="用户名",defaultValue="yangqingqing3")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "getUser",method= RequestMethod.POST)
    @ResponseBody
    public String showUser(@RequestParam(value = "userName")String userName){
        User user =userService.findByUsername(userName);
        return user.getMobile()+user.getId();
    }
}
