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
        Person p2 = (Person) applicationContext.getBean("c2");

        //3. 调用
        p.showinfo();
        p2.showinfo();

        Person p3 = (Person) applicationContext.getBean("c3");
        p3.showinfo();

        Person p4 = (Person) applicationContext.getBean("c4");
        p4.showinfo();
    }
}
