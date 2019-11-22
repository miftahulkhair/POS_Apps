package com.pos.astra.repository;

import com.pos.astra.model.MstProvince;

import java.util.List;

public interface MstProvinceDao {
    public MstProvince findOne(int id);
    public List<MstProvince> findAll();
}
