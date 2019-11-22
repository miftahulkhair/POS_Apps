package com.pos.astra.repository;

import com.pos.astra.model.MstOutlet;

import java.util.List;

public interface MstOutletDao {
    public void save(MstOutlet mstOutlet);
    public void update(MstOutlet mstOutlet);
    public List<MstOutlet> getAll();
    public MstOutlet getById(int id);
}
