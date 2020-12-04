package cool.smhw.service.iml;

import cool.smhw.service.JDKTest;

public class ImJDKTest implements JDKTest {
    @Override
    public void doSth1() {
        System.out.println("doSth1()");
    }

    @Override
    public void doSth2() {
        System.out.println("doSth2()");
    }
}
