package com.pos.astra.repository;

import com.pos.astra.model.MstDistrict;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstDistrictDaoImpl implements MstDistrictDao{

    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public MstDistrict findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstDistrict.class, id);
    }

    @Override
    public List<MstDistrict> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstDistrict.class).list();
    }
}
