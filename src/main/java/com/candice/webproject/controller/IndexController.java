package com.candice.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by candice on 2018/4/13.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstrap";
    }
}
