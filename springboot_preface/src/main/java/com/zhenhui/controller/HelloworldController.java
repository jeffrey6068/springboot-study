package com.zhenhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Controller

public class HelloworldController {
    @RequestMapping("/sayhello.html")
    public @ResponseBody String say(){
        return "hello world";
    }

}
