package com.neu.controller;

import com.neu.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//
@Controller
public class MyController {
    @RequestMapping("/hello.do")
    public ModelAndView doSome(Student stu) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("stu",stu);
        mv.setViewName("/show.jsp");
        return mv;
    }
}
