package com.pos.astra.service;

import com.pos.astra.model.MstDistrict;
import com.pos.astra.repository.MstDistrictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstDistrictService {
    @Autowired
    MstDistrictDao mstDistrictDao;

    public MstDistrict getDistrict(int id) {
        return mstDistrictDao.findOne(id);
    }

    public List<MstDistrict> getAllDistrict() {
        return mstDistrictDao.findAll();
    }
}
