package cool.smhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/test")
    public ModelAndView test01(){
        System.out.println("-------------请求到了------------");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","测试");
        mv.addObject("msg","没有说明信息");

        mv.setViewName("test");
        System.out.println("-------------处理结果------------");

        return mv;
    }
}