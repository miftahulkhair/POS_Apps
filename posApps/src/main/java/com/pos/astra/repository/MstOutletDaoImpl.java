package com.pos.astra.repository;

import com.pos.astra.model.MstOutlet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstOutletDaoImpl implements MstOutletDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(MstOutlet mstOutlet) {
        Session session = sessionFactory.getCurrentSession();
        session.save(mstOutlet);
        session.flush();
    }

    @Override
    public void update(MstOutlet mstOutlet) {
        Session session = sessionFactory.getCurrentSession();
        session.update(mstOutlet);
        session.flush();
    }

    @Override
    public List<MstOutlet> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstOutlet.class).list();

    }

    @Override
    public MstOutlet getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstOutlet.class, id);
    }
}
