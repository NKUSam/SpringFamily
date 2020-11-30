package cool.smhw.bg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("school")
public class School {

    @Value("合肥大学")
    private String name;
    private String address;

    @Value("合肥的什么区")
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
