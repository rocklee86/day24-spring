package cn.qphone.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1_IOC {

    public static void main(String[] args) {
        quickStart();
    }

    public static void quickStart() {
        //1. ApplicationContext
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2. 通过控制反转来创建对象
        Person p = (Person) applicationContext.getBean("c1");
        Person sb = (Person) applicationContext.getBean("c2");
        //3. 调用
        p.showinfo();
        sb.showinfo();
    }
}
