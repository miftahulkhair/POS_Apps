package com.pos.astra.repository;

import com.pos.astra.model.MstProvince;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstProvinceDaoImpl implements MstProvinceDao{
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public MstProvince findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstProvince.class, id);
    }

    @Override
    public List<MstProvince> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstProvince.class).list();
    }
}
