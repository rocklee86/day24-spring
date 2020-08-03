package cn.qphone.spring.di.web;

import cn.qphone.spring.di.service.UserService;
import cn.qphone.spring.ioc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServlet {

    @Autowired
    private UserService userService;

    public User get(int id) {
        User user = userService.get(id);
        return user;
    }

}
