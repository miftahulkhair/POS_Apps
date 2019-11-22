package com.pos.astra.repository;

import com.pos.astra.model.MstRegion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstRegionDaoImpl implements MstRegionDao{

    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public MstRegion findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstRegion.class, id);
    }

    @Override
    public List<MstRegion> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstRegion.class).list();
    }
}
