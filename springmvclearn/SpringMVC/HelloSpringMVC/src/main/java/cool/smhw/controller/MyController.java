package cool.smhw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/one")
    public ModelAndView doSome(){
//        System.out.println("-----------------------");
//        System.out.println("12345678912345678912345");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","MyController的实例");
        mv.addObject("test","真的是个测试");
        mv.setViewName("/show.jsp");

        return mv;
    }
}
