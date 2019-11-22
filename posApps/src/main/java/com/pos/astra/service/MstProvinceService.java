package com.pos.astra.service;

import com.pos.astra.model.MstProvince;
import com.pos.astra.repository.MstProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstProvinceService {
    @Autowired
    MstProvinceDao mstProvinceDao;

    public MstProvince getProvince(int id) {
        return mstProvinceDao.findOne(id);
    }

    public List<MstProvince> getAllProvince() {
        return mstProvinceDao.findAll();
    }
}
