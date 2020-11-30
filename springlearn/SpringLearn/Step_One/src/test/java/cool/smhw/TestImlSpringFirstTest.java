package cool.smhw;

import cool.smhw.service.SpringFirstTest;
import cool.smhw.service.iml.ImlSpringFirstTest;
import org.junit .Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestImlSpringFirstTest {
    @Test
    public void testPrint(){
        ImlSpringFirstTest test = new ImlSpringFirstTest();
        test.print();
    }


    @Test
    public void testUseSpringObject(){
        System.out.println("----------------------------------------");
        //使用Spring容器创建的对象
        //1.指定配置文件的名称
        String config = "beans.xml";
        //2.创建表示Spring容器的对象，ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //3.通过调用容器对象的方法从容器中获取某个对象（通过bean的id获取）
        SpringFirstTest sft = (SpringFirstTest)ac.getBean("ImlSpringFirstTest");
        //4.使用对象
        sft.print();
        int beanDefinitionCount = ac.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
    }

//    @Test
//    public void testDate(){
//        String config = "beans.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext();
//
//        java.util.Date date = (java.util.Date)ac.getBean("date1");
//
//        System.out.println(date.getTime());
//    }

    @Test
    public void testDate(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        java.util.Date date = (java.util.Date)ac.getBean("date1");

        System.out.println(date.getTime());
    }
}
