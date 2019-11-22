package com.pos.astra.service;

import com.pos.astra.model.MstOutlet;
import com.pos.astra.repository.MstOutletDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstOutletServiceImpl implements MstOutletService{

    @Autowired
    MstOutletDao mstOutletDao;

    @Override
    public void saveOutlet(MstOutlet mstOutlet) {
        this.mstOutletDao.save(mstOutlet);
    }

    @Override
    public void updateOutlet(MstOutlet mstOutlet) {
        this.mstOutletDao.update(mstOutlet);
    }

    @Override
    public List<MstOutlet> getAllOutlet() {
        return this.mstOutletDao.getAll();
    }

    @Override
    public MstOutlet getOutletById(int id) {
        return this.mstOutletDao.getById(id);
    }
}
