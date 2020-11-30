package cool.smhw.bg5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("student")
public class Student {

    @Value("Smith")
    private String name;
    @Value("45")
    private Integer age;

//    @Resource//默认使用byName，如果没有指定id的话就自动使用byType
    @Resource(name = "school")
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