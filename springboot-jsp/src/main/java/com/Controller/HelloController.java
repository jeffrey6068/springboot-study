package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zhenhui
 * Date: 2018-12-19
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello!!!!");
        return "index";
    }
}

