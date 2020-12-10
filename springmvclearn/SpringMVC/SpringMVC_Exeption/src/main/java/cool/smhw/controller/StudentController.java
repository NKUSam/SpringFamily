package cool.smhw.controller;

import cool.smhw.domain.Student;
import cool.smhw.exception.AgeException;
import cool.smhw.exception.NameException;
import cool.smhw.exception.StudentException;
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


    @RequestMapping("/testRedirect.do")
    public ModelAndView testResend(Student student){
        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName",student.getName());
        mv.addObject("myAge",student.getAge());

        mv.setViewName("redirect:/WEB-INF/views/show2.jsp");
        return mv;
    }

    @RequestMapping("/testException.do")
    public ModelAndView testException1(Student student) throws StudentException {
        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        if (!student.getName().equals("Sam")){
            System.out.println("-------------异常name-------------");
            throw new NameException("你不是管理员!");
        }

        if ((student.getAge().equals(null))||student.getAge()>80){
            System.out.println("-------------异常age-------------");
            throw new AgeException("您的年龄过大或输入错误!");
        }

        mv.addObject("myName",student.getName());
        mv.addObject("myAge",student.getAge());

        mv.setViewName("forward:/WEB-INF/views/show1.jsp");

        return mv;
    }
}