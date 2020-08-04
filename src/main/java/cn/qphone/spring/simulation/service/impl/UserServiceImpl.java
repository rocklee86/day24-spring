package cn.qphone.spring.simulation.service.impl;

import cn.qphone.spring.ioc.User;
import cn.qphone.spring.simulation.dao.UserDao;
import cn.qphone.spring.simulation.factory.BeanFactory;
import cn.qphone.spring.simulation.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = BeanFactory.getBean("userDao");

    public User get(int id) {
        return userDao.get(id);
    }
}
