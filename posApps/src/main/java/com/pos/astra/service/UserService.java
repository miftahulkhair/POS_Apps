package com.pos.astra.service;

import com.pos.astra.model.User;
import com.pos.astra.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService
{
    @Autowired
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User users){
        userDao.save(users);
    }

    public void delete(User users){
        userDao.delete(users);
    }

    public void update(User users){
        userDao.update(users);
    }

    public User getUser(int id) {
        return userDao.findOne(id);
    }

    public List<User> getAllUser() {
        return userDao.findAll();
    }
}
