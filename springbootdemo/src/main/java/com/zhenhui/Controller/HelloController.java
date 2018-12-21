package com.zhenhui.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Controller
/*该注解是 @Controller 和 @ResponseBody 注解的合体版*/
public class HelloController {
/*    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;
    @Autowired
    private StudentProperties studentProperties;
   */
@RequestMapping("/hello")
    public String hello(Model model) {
    System.out.println("哈哈哈哈哈");
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        //return studentProperties.getName()+studentProperties.getAge();
        return "hello";
    }
    @RequestMapping("/hello2")
    public ModelAndView hello2() {
        ModelAndView index = new ModelAndView("index");
        return  index;
    }
}
