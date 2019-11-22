package com.pos.astra.service;

import com.pos.astra.model.MstSupplier;
import com.pos.astra.repository.MstSupplierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstSupplierService {
    @Autowired
    MstSupplierDao mstSupplierDao;

//    public void setUserDao(MstSupplierDao mstSupplierDao) {
//        this.mstSupplierDao = mstSupplierDao;
//    }

    public void update(MstSupplier mstSupplier){
        mstSupplierDao.update(mstSupplier);
    }

    public MstSupplier getSupplier(int id) {
        return mstSupplierDao.findOne(id);
    }

    public List<MstSupplier> getAllSupplier() {
        return mstSupplierDao.findAll();
    }
}
