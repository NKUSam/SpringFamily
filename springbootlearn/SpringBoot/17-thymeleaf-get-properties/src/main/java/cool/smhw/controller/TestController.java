package cool.smhw.controller;

import cool.smhw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test1")
    public ModelAndView test1(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","Sam");
        mv.addObject("age",23);

        mv.setViewName("test1");
        return mv;
    }

    @RequestMapping("/test2")
    public ModelAndView test2(){
        User user = new User();
        user.setName("Sam");
        user.setAge(23);

        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("test2");
        return mv;
    }

    @RequestMapping("/test3")
    public ModelAndView test3(){
        User user = new User();
        user.setName("Sam");
        user.setAge(23);

        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("test3");
        return mv;
    }

    @RequestMapping("/test4")
    public ModelAndView test4(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("url","http://www.baidu.com");

        mv.setViewName("test4");
        return mv;
    }

    @RequestMapping("/test5")
    public String test5(){
        return "test5";
    }

    @RequestMapping("/test6")
    public ModelAndView test6(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            User user = new User();
            user.setAge(10+i);
            user.setName("test"+i);
            list.add(user);
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("users",list);

        mv.setViewName("test6");
        return mv;
    }

    @RequestMapping("/test7")
    public ModelAndView test7(){
        Map<Integer,User> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("test"+i);
            user.setAge(10+i);
            map.put(i,user);
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("map",map);

        mv.setViewName("test7");
        return mv;
    }

    @RequestMapping("/test8")
    public ModelAndView test8(){
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("test"+i);
            user.setAge(10+i);
            users[i]=user;
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("users",users);

        mv.setViewName("test8");
        return mv;
    }

    @RequestMapping("/test9")
    public ModelAndView test9(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("sex",1);
        mv.addObject("one",0);

        mv.setViewName("test9");
        return mv;
    }

    @RequestMapping("/test10")
    @ResponseBody
    public ModelAndView test10(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","测试数据.................");

        mv.setViewName("test10");
        return mv;
    }

    @RequestMapping("/test11")
    public String test11(HttpServletRequest request){

        HttpSession session = request.getSession();
        session.setAttribute("msg","测试数据.................");

        return "test11";
    }
}