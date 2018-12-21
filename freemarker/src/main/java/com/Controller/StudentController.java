package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhenhui
 * Date: 2018-11-25
 */
@Controller
public class StudentController {

    @RequestMapping("/freemarker")

    public String freemarker(Map<String, Object> map) {
        System.out.println("-------------");
        map.put("name", "Joe");
        map.put("sex", 1);    //sex:性别，1：男；0：女；
        //模拟数据
        List<Map<String, Object>> friends = new ArrayList<>();

        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbs");
        friend.put("age", 12);
        friends.add(friend);

        friend = new HashMap<String, Object>();
        friend.put("name", "ppp");
        friend.put("age", 28);
        friends.add(friend);

        map.put("friends", friends);
        return "freemarker";
    }
}
