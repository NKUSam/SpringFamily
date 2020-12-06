package cool.smhw.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cool.smhw.controller.entity.Student;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MyController {
    @RequestMapping(value = "one.do")
    public String doSome1(){
        return "show";
    }


    @RequestMapping(value = "two.do")
    public String doSome2(HttpServletRequest request, String name, Integer age){
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        return "show";
    }


    @RequestMapping(value = "returnVoidAjax.do")
    public void doSome3(HttpServletResponse response, String name,Integer age) throws IOException {
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        String json = null;

        //把对象转为Json格式的数据
        if (!student.equals(null)){
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
            System.out.println(json);
        }else {
            System.out.println("无数据传输");
        }

        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }


    @RequestMapping(value = "mvcReturn.do")
    @ResponseBody
    public Student doSome4(String name,Integer age){
        Student student = new Student();
        student.setName("颖颖姐");
        student.setAge(27);
        return student;
    }


    @RequestMapping(value = "mvcReturnArray.do")
    @ResponseBody
    public List<Student> doSome5(){
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setAge(20);
        student.setName("张三");
        list.add(student);

        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("李四");
        list.add(student1);

        return list;
    }

    //produces是指定转换的类型
    @RequestMapping(value = "returnString.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doSome6(){
        return "你好世界!";
    }
}