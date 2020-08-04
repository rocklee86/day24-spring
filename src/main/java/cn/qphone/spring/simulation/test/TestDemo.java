package cn.qphone.spring.simulation.test;

import cn.qphone.spring.ioc.User;
import cn.qphone.spring.simulation.factory.BeanFactory;
import cn.qphone.spring.simulation.web.UserServlet;

public class TestDemo {
    public static void main(String[] args) {
        UserServlet userServlet = BeanFactory.getBean("userServlet");
        User user = userServlet.get(1);
        System.out.println(user);
    }
}
