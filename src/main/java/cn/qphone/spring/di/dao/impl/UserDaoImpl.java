package cn.qphone.spring.di.dao.impl;

import cn.qphone.spring.di.dao.UserDao;
import cn.qphone.spring.ioc.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public User get(int id) {
        User user = new User();
        user.setName("李熙");
        return user;
    }
}
