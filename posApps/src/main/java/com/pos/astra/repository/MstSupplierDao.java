package com.pos.astra.repository;

import com.pos.astra.model.MstSupplier;

import java.util.List;

public interface MstSupplierDao {
    public void update(MstSupplier mstSupplier);
    public MstSupplier findOne(int id);
    public List<MstSupplier> findAll();
}
