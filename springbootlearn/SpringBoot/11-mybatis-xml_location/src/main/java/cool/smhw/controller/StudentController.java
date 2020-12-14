package cool.smhw.controller;

import cool.smhw.entity.Student;
import cool.smhw.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Student getById(Integer id){
        return studentService.getById(id);
    }
}
