package com.pos.astra.repository;

import com.pos.astra.model.MstDistrict;

import java.util.List;

public interface MstDistrictDao {
    public MstDistrict findOne(int id);
    public List<MstDistrict> findAll();
}
