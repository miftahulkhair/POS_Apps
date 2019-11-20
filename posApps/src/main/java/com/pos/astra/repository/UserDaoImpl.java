package com.pos.astra.repository;

import com.pos.astra.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User users) {
        //session bikin koneksi ke model
        Session session = sessionFactory.getCurrentSession();
        session.save(users);
        session.flush();
    }

    @Override
    public void delete(User users) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(users);
        session.flush();
    }

    @Override
    public void update(User users) {
        Session session = sessionFactory.getCurrentSession();
        session.update(users);
        session.flush();
    }

    @Override
    public User findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(User.class).list();
    }
}