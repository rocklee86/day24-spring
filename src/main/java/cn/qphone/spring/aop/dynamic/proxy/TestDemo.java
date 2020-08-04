package cn.qphone.spring.aop.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo {

    public static void main(String[] args) {
        //1. proxy就是一个代理对象
        /*
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * InvocationHandler h
         */
        ClassLoader classLoader = Star.class.getClassLoader();
        Class[] interfaces = {Person.class};
        final Star star = new Star();

        /**
         * classLoader : 类的加载器，可以是任意类的加载器
         * interfaces : 必须是被代理对象的父接口
         * InvocationHandler : 取决于被代理对象的哪些方法可以被代理
         */
        Person proxy = (Person) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(star, args);
                System.out.println("proxy method is invoked");
                return proxy;
            }
        });
        proxy.speak();
    }
}
