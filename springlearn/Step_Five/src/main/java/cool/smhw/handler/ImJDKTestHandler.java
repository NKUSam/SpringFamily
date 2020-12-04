package cool.smhw.handler;

import cool.smhw.util.JDKTestUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImJDKTestHandler implements InvocationHandler{

    private Object target;

    public ImJDKTestHandler(Object handler){
        this.target = handler;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用这个方法
        JDKTestUtil.test01();

        Object res = null;

        //执行目标类的方法是通过method实现
        res = method.invoke(target,args);

        JDKTestUtil.test02();
        return res;

    }
}
