package com.pos.astra.service;

import com.pos.astra.model.MstRegion;
import com.pos.astra.repository.MstRegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstRegionService {
    @Autowired
    MstRegionDao mstRegionDao;

    public MstRegion getRegion(int id) {
        return mstRegionDao.findOne(id);
    }

    public List<MstRegion> getAllRegion() {
        return mstRegionDao.findAll();
    }
}
