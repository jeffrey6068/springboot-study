package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhenhui
 * Date: 2018-11-25
 */
@Controller
public class SampleController {
    @RequestMapping("/sayhello.html")
    public @ResponseBody
    String say(){
        return "hello world";
    }
}
