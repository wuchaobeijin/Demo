package com.student.service;

import com.student.bean.User;
import com.student.common.persistence.Page;
import com.student.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wuchao
 * @date： 2017/5/2
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean checkUsers(String name, String password) {
        return userDao.findUserByNameAndPass(name, password);
    }

    public void saveUser(User user){
         userDao.save(user);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public User getUser(Long id) {
        return userDao.find(id);
    }

    public Page<User> findAll(Page<User> page) {
        return userDao.findPage(page,"select * from User");
    }

}
