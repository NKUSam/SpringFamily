package cool.smhw.bg1;


import org.springframework.stereotype.Component;


//value中的值（唯一的）为对象的名称，与<bean>标签具有相同的作用并且只创建一个对象

//@Component(value = "myStudent")
@Component("myStudent")
//如果不加(value = "myStudent")，默认为student
public class Student {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}