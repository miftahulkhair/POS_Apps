package com.pos.astra.repository;

import com.pos.astra.model.MstUser;

import java.util.List;

public interface MstUserDao {
    public void save(MstUser mstUser);
    public void update(MstUser mstUser);
    public List<MstUser> getAll();
    public MstUser getById(int id);
}
