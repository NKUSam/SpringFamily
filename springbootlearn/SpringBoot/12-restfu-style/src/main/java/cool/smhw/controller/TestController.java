package cool.smhw.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/student")
    public String test1(Integer id,Integer age){
        return id+"  "+age;
    }

    @RequestMapping(value = "/student/{id}/{age}",method = RequestMethod.GET)
    public String test2(@PathVariable("id") Integer id, @PathVariable("age") Integer age){
        return id+"  "+age;
    }

}