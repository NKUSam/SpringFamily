package cool.smhw.controller;

import cool.smhw.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/testForward.do")
    public ModelAndView testForward(Student student){
        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName",student.getName());
        mv.addObject("myAge",student.getAge());

        mv.setViewName("forward:/WEB-INF/views/show1.jsp");
        return mv;
    }


    @RequestMapping("testRedirect.do")
    public ModelAndView testResend(Student student){
        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName",student.getName());
        mv.addObject("myAge",student.getAge());

        mv.setViewName("redirect:/WEB-INF/views/show2.jsp");
        return mv;
    }
}