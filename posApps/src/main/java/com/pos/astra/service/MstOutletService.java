package com.pos.astra.service;

import com.pos.astra.model.MstOutlet;

import java.util.List;

public interface MstOutletService {
    public void saveOutlet(MstOutlet mstOutlet);
    public void updateOutlet(MstOutlet mstOutlet);
    public List<MstOutlet> getAllOutlet();
    public MstOutlet getOutletById(int id);
}
