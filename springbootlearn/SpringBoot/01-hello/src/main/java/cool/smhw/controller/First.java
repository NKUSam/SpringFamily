package cool.smhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class First {

    @RequestMapping("/springboot/first")
    @ResponseBody
    public String testFirst(){
        return "hello spring boot";
    }
}
