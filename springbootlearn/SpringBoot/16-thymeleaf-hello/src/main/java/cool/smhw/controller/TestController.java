package cool.smhw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public ModelAndView test01(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","动态内容展示");
        mv.setViewName("test01");

        return mv;
    }

}
