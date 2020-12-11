package cool.smhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","信息1");
        mv.addObject("test","测试1");

        mv.setViewName("test");
        return mv;
    }
}