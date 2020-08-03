package cn.qphone.spring.di.test;

import cn.qphone.spring.di.web.UserServlet;
import cn.qphone.spring.ioc.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-annotation.xml");
        UserServlet userServlet = context.getBean(UserServlet.class);
        User user = userServlet.get(1);
        System.out.println(user);
    }
}
