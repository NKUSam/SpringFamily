package cool.smhw.controller;

import cool.smhw.mapper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private Student student;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "姓名："+student.getName()+"/n"+"年龄："+student.getAge();
    }

}
