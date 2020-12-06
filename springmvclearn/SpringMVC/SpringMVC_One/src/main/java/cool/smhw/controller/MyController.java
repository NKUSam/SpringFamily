package cool.smhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.bind.SchemaOutputResolver;

@Controller
@RequestMapping("test/")
public class MyController {

//    @RequestMapping(value = "test/one.do")
    @RequestMapping(value = "one.do")
    public ModelAndView doSome(){

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");

        ModelAndView mv = new ModelAndView();
        mv.addObject("name","MyController的实例");
        mv.addObject("test","真的是个测试");

        mv.setViewName("show");

        return mv;
    }


    //RequestMethod.方法名，不作详细说明则所有方法都可以
    @RequestMapping(value = "two.do",method = RequestMethod.GET)
    public ModelAndView doOther(){

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");

        ModelAndView mv = new ModelAndView();
        mv.addObject("name","MyController的实例");
        mv.addObject("test","真的是个测试");

        mv.setViewName("other");

        return mv;
    }
}
