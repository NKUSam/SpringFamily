package cool.smhw;

import cool.smhw.bg01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//
//    @Test
//    public void testStudent(){
//        String config = "bg01/applicationContext.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//
//        Student student = (Student)ac.getBean("myStudent");
//        System.out.println(student);
//    }
//
//    @Test
//    public void testObject(){
//        String config = "bg02/applicationContext.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//
//        cool.smhw.bg02.Student student = (cool.smhw.bg02.Student)ac.getBean("student");
//        System.out.println(student.toString());
//    }

    @Test
    public void setConstructor(){
        String config = "bg03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        cool.smhw.bg03.Student student = (cool.smhw.bg03.Student)ac.getBean("student");
        System.out.println(student);
    }
}
