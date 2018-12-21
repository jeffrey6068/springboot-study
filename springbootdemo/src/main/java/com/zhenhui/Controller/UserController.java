package com.zhenhui.Controller;

import com.zhenhui.entity.User;
import com.zhenhui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Controller
@RequestMapping(value = "/user")

public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(@RequestParam("name")String name) {
        User user = userService.findUderByName(name);
        if (user != null) {
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        }
        else return "null";
    }
}
