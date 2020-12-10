package cool.smhw.controller;

import cool.smhw.domain.Student;
import cool.smhw.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;

    @RequestMapping("/add.do")
    public ModelAndView addStudent(Student student){
//        System.out.println(student);
//        ModelAndView mv = new ModelAndView();
//        String tips = "注册失败";
//        //调用service处理student
//        int nums = service.addStudent(student);
//        if( nums > 0 ){
//            //注册成功
//            tips = "学生【" + student.getName() + "】注册成功";
//        }
//        //添加数据
//        mv.addObject("tips",tips);
//        //指定结果页面
//        mv.setViewName("result");
//        return mv;

        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        int i = service.addStudent(student);
        if (i>0){
            mv.addObject("status","注册成功");
        }else {
            mv.addObject("status","注册失败");
        }
        mv.setViewName("addResult");
        return mv;
    }

    //处理查询相应Ajax
    @RequestMapping("/selectStudents.do")
    @ResponseBody
    public List<Student> selectStudents(){
        List<Student> students = service.findStudents();
        return students;
    }
}