package com.pos.astra.repository;

import com.pos.astra.model.MstRegion;

import java.util.List;

public interface MstRegionDao {
    public MstRegion findOne(int id);
    public List<MstRegion> findAll();
}
