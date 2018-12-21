package com.zhenhui.Controller;

import com.zhenhui.mapper.StudentMapper;
import com.zhenhui.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model) {
        System.out.println("---------");
        List<Student> students  = studentMapper.findAll();
        model.addAttribute("students", students);
        return "listStudent";
    }
}
