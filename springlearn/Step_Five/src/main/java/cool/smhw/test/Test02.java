package cool.smhw.test;

import cool.smhw.handler.ImJDKTestHandler;
import cool.smhw.service.JDKTest;
import cool.smhw.service.iml.ImJDKTest;

import java.lang.reflect.Proxy;

public class Test02 {
    public static void main(String[] args) {

        ImJDKTest test = new ImJDKTest();

        ImJDKTestHandler handler = new ImJDKTestHandler(test);

        JDKTest new_test = (JDKTest) Proxy.newProxyInstance(test.getClass().getClassLoader(),
                test.getClass().getInterfaces(),handler);
        new_test.doSth1();

        new_test.doSth2();
    }
}
