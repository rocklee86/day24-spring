package cn.qphone.spring.simulation.dao.impl;

import cn.qphone.spring.ioc.User;
import cn.qphone.spring.simulation.dao.UserDao;
import org.springframework.stereotype.Repository;

public class UserDaoImpl implements UserDao {
    public User get(int id) {
        User user = new User();
        user.setName("李熙");
        return user;
    }
}
