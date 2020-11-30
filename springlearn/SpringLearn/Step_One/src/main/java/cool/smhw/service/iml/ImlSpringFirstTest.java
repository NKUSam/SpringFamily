package cool.smhw.service.iml;

import cool.smhw.service.SpringFirstTest;

public class ImlSpringFirstTest implements SpringFirstTest {
    @Override
    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("实现了SpringFirstTest接口，并正在执行");
        }
    }
}
