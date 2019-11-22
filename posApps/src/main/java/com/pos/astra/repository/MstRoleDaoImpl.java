package com.pos.astra.repository;

import com.pos.astra.model.MstRole;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MstRoleDaoImpl implements MstRoleDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<MstRole> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstRole.class).list();
    }

    @Override
    public MstRole getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstRole.class, id);
    }
}
