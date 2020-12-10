package cool.smhw.handler;

import cool.smhw.exception.AgeException;
import cool.smhw.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class GlobalHandler {
    
    @ExceptionHandler(value = NameException.class)
    public ModelAndView exeptionName(Exception e){
        /*
            处理逻辑：
            1.把异常记录下来，记录到数据库或日志文件（时间，哪个方法，错误内容）
            2.发送通知
            3.给用户友好提示
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是Sam");
        mv.addObject("ex",e);
        System.out.println("-----------nameError-------------");
        mv.setViewName("nameError");

        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView exeptionAge(Exception e){
        /*
            处理逻辑：
            1.把异常记录下来，记录到数据库或日志文件（时间，哪个方法，错误内容）
            2.发送通知
            3.给用户友好提示
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄不符合要求");
        mv.addObject("ex",e);
        System.out.println("-----------ageError-------------");
        mv.setViewName("forward:/WEB-INF/views/ageError.jsp");

        return mv;
    }

    @ExceptionHandler
    public ModelAndView myException(Exception e){
        /*
            处理逻辑：
            1.把异常记录下来，记录到数据库或日志文件（时间，哪个方法，错误内容）
            2.发送通知
            3.给用户友好提示
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","异常出现!!!");
        mv.addObject("ex",e);
        System.out.println("-----------ageError-------------");
        mv.setViewName("ageError");

        return mv;
    }
}