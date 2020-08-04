package cn.qphone.spring.simulation.web;

import cn.qphone.spring.ioc.User;
import cn.qphone.spring.simulation.factory.BeanFactory;
import cn.qphone.spring.simulation.service.UserService;

public class UserServlet {

    private UserService userService = BeanFactory.getBean("userService");

    public User get(int id) {
        User user = userService.get(id);
        return user;
    }

}
