package com.pos.astra.repository;

import com.pos.astra.model.MstSupplier;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MstSupplierDaoImpl implements MstSupplierDao{
    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void update(MstSupplier mstSupplier) {
        Session session = sessionFactory.getCurrentSession();
        session.update(mstSupplier);
        session.flush();
    }

    @Override
    public MstSupplier findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(MstSupplier.class, id);
    }

    @Override
    public List<MstSupplier> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(MstSupplier.class).list();
    }

//    private void getCriteria(Map<String, Object> filters, Criteria criteria) {
//        if (JdcStringUtil.hasValue(filters)) {
//            for (Map.Entry<String, Object> filter : filters.entrySet()) {
//                Object value = filter.getValue();
//                if (filter.getKey().equals(CommonConstant.SEARCH_ANY)) {
//                    criteria.add(buildResctrictionsAndForAllProperty(new String[]{"vname", "vdesc"},
//                            JdcStringUtil.splitBySpace(value.toString())));
//                } else if (filter.getKey().equals("%name")) {
//                    criteria.add(Restrictions.ilike("vname", value.toString(), MatchMode.ANYWHERE));
//                } else if (filter.getKey().equals("%desc")) {
//                    criteria.add(Restrictions.ilike("vdesc", value.toString(), MatchMode.ANYWHERE));
//                } else if (filter.getKey().equals("=status")) {
//                    if (filter.getValue().toString().equals(Mst000Constant.ACTIVE)) {
//                        criteria.add(Restrictions.eq("bstatus", Boolean.TRUE));
//                    } else if (filter.getValue().toString().equals(Mst000Constant.INACTIVE)) {
//                        criteria.add(Restrictions.eq("bstatus", Boolean.FALSE));
//                    }
//                }
//            }
//        }
//    }
}
