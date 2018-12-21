package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhenhui
 * Date: 2018-12-09
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("hello");
        return "index";
    }
}
