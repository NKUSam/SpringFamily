package cool.smhw.controller;

import cool.smhw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {


    //不登陆可访问
    @RequestMapping("/login")
    @ResponseBody
    public String login(Integer id, String name, HttpServletRequest request){
        User user = new User();
        user.setId(id);
        user.setName(name);

        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        return "login success";
    }

    //登录可访问
    @RequestMapping("/context")
    @ResponseBody
    public String context(){
        return "xxx";
    }

    //不登陆可访问
    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        return "out";
    }
}
