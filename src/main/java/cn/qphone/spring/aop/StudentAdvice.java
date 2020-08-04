package cn.qphone.spring.aop;

public class StudentAdvice {
    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }
}
