package cn.qphone.spring.di.service.impl;

import cn.qphone.spring.di.dao.UserDao;
import cn.qphone.spring.di.service.UserService;
import cn.qphone.spring.ioc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User get(int id) {
        return userDao.get(id);
    }
}
