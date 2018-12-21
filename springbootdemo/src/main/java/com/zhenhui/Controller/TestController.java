package com.zhenhui.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Zhenhui
 * Date: 2018-12-09
 */
@Controller
public class TestController {
    @RequestMapping("/demo")
    public String demo(Map<String, Object> map) {
        map.put("descrip", "It's a springboot integrate freemarker's demo!!!!");
        return "demo";
    }
}