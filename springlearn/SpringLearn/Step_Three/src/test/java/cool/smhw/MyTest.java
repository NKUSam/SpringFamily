package cool.smhw;

import cool.smhw.bg02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student)ac.getBean("student");
        System.out.println(student);
    }
}
