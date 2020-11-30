package cool.smhw.bg4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

    @Value("Smith")
    private String name;
    @Value("45")
    private Integer age;
    @Autowired(required = false) //默认是true
    @Qualifier("school")  //使用byName的方式
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}