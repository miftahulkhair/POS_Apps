package com.pos.astra.repository;


import com.pos.astra.model.User;

import java.util.List;

public interface UserDao
{
    public void save(User users);
    public void delete(User users);
    public void update(User users);
    public User findOne(int id);
    public List<User> findAll();
}