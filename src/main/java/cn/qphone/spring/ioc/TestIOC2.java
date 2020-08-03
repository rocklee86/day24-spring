package cn.qphone.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC2 {
    public static void main(String[] args) {
        //1. 创建applicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-annotation.xml");
        //2. 获取对象
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
