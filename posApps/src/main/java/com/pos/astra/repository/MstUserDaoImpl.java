package com.pos.astra.repository;

import com.pos.astra.model.MstUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstUserDaoImpl implements MstUserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(MstUser mstUser) {
        Session session = sessionFactory.getCurrentSession();
        session.save(mstUser);
        session.flush();
    }

    @Override
    public void update(MstUser mstUser) {
        Session session = sessionFactory.getCurrentSession();
        session.update(mstUser);
        session.flush();
    }

    @Override
    public List<MstUser> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstUser.class).list();
    }

    @Override
    public MstUser getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstUser.class, id);
    }

}
