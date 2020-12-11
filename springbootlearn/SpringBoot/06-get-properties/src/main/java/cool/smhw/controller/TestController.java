package cool.smhw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${myweb.name}")
    private String name;

    @Value("${myweb.ex}")
    private String msg;


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "返回值："+name+msg;
    }
}
