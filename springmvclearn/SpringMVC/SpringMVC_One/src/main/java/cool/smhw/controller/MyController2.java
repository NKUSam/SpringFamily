package cool.smhw.controller;

import cool.smhw.controller.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {

    @RequestMapping(value = "/test/param.do",method = RequestMethod.POST)
    public ModelAndView doSome(@RequestParam(value = "name",required = false) String uname, @RequestParam(value = "pwd",required = false) Integer upwd){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",uname);
        mv.addObject("pwd",upwd);
        mv.setViewName("show2");

        return mv;
    }

    @RequestMapping(value = "/test/objectparam.do",method = RequestMethod.POST)
    public ModelAndView doSome(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("pwd",student.getPwd());
        mv.setViewName("show2");

        return mv;
    }
}
