package cool.smhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    //produces是指定转换的类型
    @RequestMapping(value = "/test.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doSome(){
        return "你好世界!";
    }

}